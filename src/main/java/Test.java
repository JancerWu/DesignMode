import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.Random;

public class Test {


    public static Random rdm = new Random();
    static int times = 1000, usersNum = (int) (1e4), energyNum = (int) (1e5);

    static class FireFlag {
        private volatile boolean fired = false;

        public synchronized void waitForFire() throws InterruptedException {
            while (!fired) {
                wait();
            }
        }

        public synchronized void fire() {
            this.fired = true;
            notifyAll();
        }
    }

    static class MyLatch {
        private int count;

        public MyLatch(int count) {
            this.count = count;
        }

        public synchronized void await() throws InterruptedException {
            while (count > 0) {
                wait();
            }
        }

        public synchronized void countDown() {
            count--;
            if (count <= 0) {
                notifyAll();
            }
        }
    }

    static class StealEnergyThread extends Thread {
        FireFlag fireFlag;
        MyLatch myLatch;
        int toCollectEnergyId;

        public StealEnergyThread(FireFlag fireFlag, MyLatch myLatch, int toCollectEnergyId) {
            this.fireFlag = fireFlag;
            this.myLatch = myLatch;
            this.toCollectEnergyId = toCollectEnergyId;
        }

        @Override
        public void run() {
            try {
                this.fireFlag.waitForFire();
                int userId = 1;
                String url = String.format("http://localhost:8080/collect_energy/%d/%d", userId, toCollectEnergyId);
                doPostJson(url, "");
                this.myLatch.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        double totalTimes = 0;
        int turnTimes = 1;
        int[] toCollectId = {74253, 80248, 67440, 77650, 94641, 64794, 22025, 92175, 39692, 75420, 55596, 52707, 10031, 24713, 77632, 86127, 66532, 15034, 55794, 90149, 18544, 25393, 27540};
        int n = toCollectId.length;
        for (int turn = 0; turn < turnTimes; turn++) {
            Thread[] threads = new StealEnergyThread[n];
            FireFlag fireFlag = new FireFlag();
            MyLatch myLatch = new MyLatch(n);
            for (int i = 0; i < n; i++) {
                threads[i] = new StealEnergyThread(fireFlag, myLatch, toCollectId[i]);
                threads[i].start();
            }
            fireFlag.fire();
            long startTimes = System.currentTimeMillis();
            myLatch.await();
            long endTimes = System.currentTimeMillis();
            totalTimes += endTimes - startTimes;
        }
        System.out.println("并发度1000循环" + turnTimes + "次访问用时" + totalTimes / 1000.0 + "秒");

    }


    /**
     * 发送post 请求
     *
     * @param url  请求地址
     * @param json 请求参数
     * @return
     */
    public static String doPostJson(String url, String json) {
        // 创建Httpclient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        String resultString = "";
        try {
            // 创建Http Post请求
            HttpPost httpPost = new HttpPost(url);
            // 创建请求内容
            StringEntity entity = new StringEntity(json, ContentType.APPLICATION_JSON);
            httpPost.setEntity(entity);
            // 执行http请求
            response = httpClient.execute(httpPost);
            resultString = EntityUtils.toString(response.getEntity(), "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (response != null) {
                    response.close();
                }
                httpClient.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return resultString;
    }


}

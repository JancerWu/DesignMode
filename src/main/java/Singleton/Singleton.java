package Singleton;

//// 饿汉式，缺点是类加载时就实例化，不适合内存占用过大的单例
// public class Singleton {
//    private static Singleton singleton = new Singleton();
//    public static Singleton getSingleton() {
//        return singleton;
//    }
//}


////双重校验锁，延迟加载
//public class Singleton {
//    private static volatile Singleton singleton = null;
//    public static Singleton getSingleton() {
//        if (singleton == null) {
//            synchronized (Singleton.class) {
//                if (singleton == null) {
//                    singleton = new Singleton();
//                }
//            }
//        }
//        return singleton;
//    }
//}

////静态内部类实现
public class Singleton {
    private static class SingletonHolder{
        private static final Singleton singleton = new Singleton();
    }
    public Singleton getSingleton() {
        return SingletonHolder.singleton;
    }
}


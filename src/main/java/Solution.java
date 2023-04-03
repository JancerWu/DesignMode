
/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2020-2021. All rights reserved.
 * Note: 缺省代码仅供参考，可自行决定使用、修改或删除
 */

import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * OJ考题代码：单板告警统计
 *
 * @author 命题组
 * @since 2021-01-30
 */

public class Solution {
    private static String getHexString(String num) {
        if (num.length() > 10)  return "overflow";
        long number = Long.parseLong(num);
        if (number < -Math.pow(2, 31) || number >= Math.pow(2, 32)) {
            return "overflow";
        }
        String tmp = Long.toHexString(number);
        // 去除前面的补位
        if (tmp.length() > 8) {
            tmp = tmp.substring(tmp.length() - 8);
        }
        // 不足的还需要补位
        else if (tmp.length() < 8) {
            while (tmp.length() != 8) tmp = "0" + tmp;
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < tmp.length(); i++) {
            char c = tmp.charAt(i);
            if (Character.isDigit(c)) ans.append(c);
            else ans.append((char) (c - 'a' + 'A'));
            if ((i != tmp.length() - 1) && (i % 2 == 1)) ans.append(" ");
        }
        String[] parts = ans.toString().split(" ");
        ans.append("\n");
        for (int i = parts.length - 1; i >= 0; i--) {
            ans.append(parts[i]);
            if (i != 0) ans.append(" ");
        }
        return ans.toString();
    }


    // 待实现函数，在此函数中填入答题代码
    private static String[] getAllFault(String[] arrayA, String[] arrayB) {
        Set<String> set = new HashSet<>();
        for (String s : arrayA) set.add(s);
        for (String s : arrayB) set.add(s);
        String[] ans = new String[set.size()];
        int cnt = 0;
        for (String s : set) ans[cnt++] = s;
        Arrays.sort(ans);
        return ans;
    }


    /**
     * main入口由OJ平台调用
     */
    public static void main(String[] args) {
        System.out.println(getHexString("1"));

    }
}

package com.company.Easy.LongestCommonPrefix;

/**
 * Created by cuongnghiem on 20/11/2021
 * https://leetcode.com/problems/longest-common-prefix/
 **/

public class MainClass {
    public static void main(String[] args) {
        MainClass obj = new MainClass();
        String[] string = new String[] {
                "flower",
                "",
                "flowdeb"
        };

        System.out.println(obj.longestCommonPrefix(string));
    }

    public String longestCommonPrefix(String[] strs) {
        StringBuilder builder = new StringBuilder();
        boolean stop = false;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++)
                if (i >= strs[j].length() || strs[j].charAt(i) != strs[0].charAt(i)) {
                    stop = true;
                    break;
                }
            if (!stop)
                builder.append(strs[0].charAt(i));
            else
                break;
        }

        return builder.toString();
    }
}

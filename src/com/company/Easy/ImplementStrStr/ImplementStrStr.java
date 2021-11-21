package com.company.Easy.ImplementStrStr;

/**
 * Created by cuongnghiem on 21/11/2021
 * https://leetcode.com/problems/implement-strstr/
 **/

public class ImplementStrStr {

    public static void main(String[] args) {
        ImplementStrStr obj = new ImplementStrStr();
        System.out.println(obj.strStr("aabaaabaaac", "aabaaac"));
    }

    public int strStr(String haystack, String needle) {
        if (needle.length() == 0)
            return 0;
        int[] lps = initLps(needle);
        int p1 = 0, p2 = 0;
        while (p1 < haystack.length()) {
            if (haystack.charAt(p1) == needle.charAt(p2)) {
                if (p2 == needle.length() - 1)
                    return p1 - p2;
                p1++;
                p2++;
            } else if (p2 != 0){
                p2 = lps[p2];
            } else {
                p1++;
            }
        }
        return -1;
    }

    public int[] initLps(String pattern) {
        int[] lps = new int[pattern.length() + 1];
        int p1 = 0;
        for (int i = 2; i <= pattern.length(); i++) {
            if (pattern.charAt(i-1) == pattern.charAt(p1))
            {
                p1++;
                lps[i] = lps[i-1] + 1;
            } else if (pattern.charAt(i-1) == pattern.charAt(0)) {
                p1 = 1;
                lps[i] = 1;
            } else {
                p1 = 0;
                lps[i] = 0;
            }
        }
        return lps;
    }
}

package com.company.Easy.EasyPalindrome;

/**
 * Created by cuongnghiem on 20/11/2021
 * https://leetcode.com/problems/palindrome-number/solution/
 **/

public class MainClass {
    public static void main(String[] args) {
        MainClass obj = new MainClass();
        System.out.println(obj.isPalindrome(100));
    }

    public boolean isPalindrome(int x) {
        if (x < 0 || x == 10)
            return false;
        if (x < 10 || x == 11)
            return true;
        if (x % 10 == 0)
            return false;

        int reversed = 0;
        while (x > reversed) {
            int num = x % 10;
            x = x / 10;
            reversed = reversed * 10 + num;
        }
        if (x == reversed || (reversed/10 == x))
            return true;
        return false;
    }


}

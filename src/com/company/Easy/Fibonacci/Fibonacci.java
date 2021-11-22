package com.company.Easy.Fibonacci;

/**
 * Created by cuongnghiem on 22/11/2021
 * https://leetcode.com/problems/fibonacci-number
 **/

public class Fibonacci {
    public static void main(String[] args) {
        Fibonacci obj = new Fibonacci();
        System.out.println(obj.fib(30));
    }

    public int fib(int n) {
        int[] dp = new int[n + 2];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <=n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
}

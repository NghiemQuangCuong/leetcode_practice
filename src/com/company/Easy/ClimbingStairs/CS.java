package com.company.Easy.ClimbingStairs;

/**
 * Created by cuongnghiem on 22/11/2021
 * https://leetcode.com/problems/climbing-stairs/
 **/

public class CS {
    public static void main(String[] args) {
        System.out.println(new CS().climbStairs(5));
    }

    public int climbStairs(int n) {
        int[] db = new int[n+2];
        db[1] = 1;
        db[2] = 2;
        for (int i = 3; i <= n; i++)
            db[i] = db[i-1] + db[i-2];
        return db[n];
    }
}

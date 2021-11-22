package com.company.Easy.MinCostClimbStairs;

/**
 * Created by cuongnghiem on 22/11/2021
 * https://leetcode.com/problems/min-cost-climbing-stairs/
 **/

public class MCCS {
    public static void main(String[] args) {
        System.out.println(new MCCS().minCostClimbingStairs(
                new int[]{10,15,20}
        ));
    }

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int p1 = cost[0];
        int p2 = cost[1];
        if (n <= 2)
            return Math.min(p1, p2);
        int tmp;
        for (int i = 2; i < n; i++) {
            tmp = Math.min(p1, p2) + cost[i];
            p1 = p2;
            p2 = tmp;
        }

        return Math.min(p1, p2);
    }
}

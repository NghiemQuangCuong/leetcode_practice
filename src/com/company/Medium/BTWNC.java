package com.company.Medium;

import java.util.Arrays;

/**
 * Created by cuongnghiem on 21/11/2021
 * https://leetcode.com/problems/best-team-with-no-conflicts/
 **/

public class BTWNC {
    public static void main(String[] args) {
        BTWNC obj = new BTWNC();
        System.out.println(obj.bestTeamScore(
                new int[]{1, 3, 1, 2, 2, 3, 1, 9, 1, 1, 2},
                new int[]{5, 5, 5, 6, 7, 8, 9, 1, 2, 3, 4}));
    }

    public int bestTeamScore(int[] scores, int[] ages) {
        int n = scores.length;
        int result = 0;
        int[][] team = new int[n][2];
       for (int i = 0; i < n; i++) {
           team[i][0] = ages[i];
           team[i][1] = scores[i];
       }
       Arrays.sort(team, (a, b) -> (a[0] != b[0]) ? a[0] - b[0] : a[1] - b[1]);

       int[] dp = new int[n];
       dp[0] = team[0][1];
       for (int i = 1; i < n; i++) {
           int max = team[i][1];
           for (int j = 0; j < i; j++) {
               if (team[i][1] >= team[j][1]) {
                   max = Math.max(max, dp[j] + team[i][1]);
               }
           }
           dp[i] = max;
           if (max > result)
               result = max;
       }
       return result;
    }
}

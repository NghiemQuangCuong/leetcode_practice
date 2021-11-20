package com.company.Easy.EasyTwoSum;

import java.util.HashMap;

/**
 * Created by cuongnghiem on 20/11/2021
 * https://leetcode.com/problems/two-sum/
 **/

public class MainClass {
    public static void main(String[] args) {
        MainClass obj = new MainClass();
        int[] result = obj.twoSum(new int[]{3, 2, 4}, 6);
        for (int i : result)
            System.out.println(i);
    }


    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int numToFind = target - nums[i];
            if (map.get(numToFind) != null)
                return new int[] {map.get(numToFind), i};
            map.put(nums[i], i);
        }
        return new int[] {-1};
    }

}

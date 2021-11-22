package com.company.Easy.SearchInsertPosition;

/**
 * Created by cuongnghiem on 22/11/2021
 * https://leetcode.com/problems/search-insert-position/
 **/

public class SIP {
    public static void main(String[] args) {
        System.out.println(new SIP().searchInsert(
                new int[]{1, 3},
                2));
    }

    public int searchInsert(int[] nums, int target) {
        if (target < nums[0])
            return 0;
        if (target > nums[nums.length -1 ])
            return nums.length;

        int p1 = 0;
        int p2 = nums.length - 1;
        int mid = 0;
        while (p1 < p2) {
            mid = p1 + ((p2 - p1) / 2);
            if (target < nums[mid]) {
                p2 = mid;
            } else if (target > nums[mid]){
                p1 = mid + 1;
            } else
                return mid;
        }

        if (target <= nums[mid])
            return mid;
        else
            return mid + 1;
    }
}

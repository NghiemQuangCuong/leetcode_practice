package com.company.Easy.RemoveDuplicate;

/**
 * Created by cuongnghiem on 21/11/2021
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array
 **/

public class RemoveDuplicate {

    public static void main(String[] args) {
        RemoveDuplicate obj = new RemoveDuplicate();
        System.out.println(obj.removeDuplicates(new int[]{0, 0, 1, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6}));
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int count = 0;
        for (int i : nums) {
            if (i != nums[count])
                nums[++count] = i;
        }
        return ++count;
    }
}

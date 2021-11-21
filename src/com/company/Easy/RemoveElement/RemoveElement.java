package com.company.Easy.RemoveElement;

/**
 * Created by cuongnghiem on 21/11/2021
 * https://leetcode.com/problems/remove-element
 **/

public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement obj = new RemoveElement();
        System.out.println(obj.removeElement(new int[]{1, 2, 3, 3, 4, 5, 3 ,3}, 3));
    }

    public int removeElement(int[] nums, int val) {
        if (nums.length == 0)
            return 0;
        int p = 0;
        for (int e : nums) {
            if (e != val)
                nums[p++] = e;
        }
        return p;
    }
}

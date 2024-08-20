package com.learning.ds.leetcode;

public class P1909_RemoveOneElementToMakeArrayStrictlyIncreasing {
    public static void main(String[] args) {
        int[] inArray = {1,2,10,5,7};
        boolean solution = canBeIncreasing(inArray);
        System.out.println(solution);
    }

    public static boolean canBeIncreasing(int[] nums) {
        int prevVal = Integer.MIN_VALUE;
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > prevVal) {
                if(i < nums.length - 2 && nums[i] > nums[i+1]) {
                    prevVal = nums[i - 1];
                } else {
                    prevVal = nums[i];
                }
            } else {
               count++;
            }
        }
        return count <= 1;
    }

}

package com.learning.ds.leetcode;

public class P416_PartitionEqualSubsetSum {
    public static void main(String[] args) {
        int inArray[] = {1,5,11,5};
        boolean answer = canPartition(inArray);
        System.out.println(answer);
    }

    public static boolean canPartition(int[] nums) {
        return check(nums, 0, 0, 0);
    }

    private static boolean check(int[] nums, int index, int sum1, int sum2) {

        if(index == nums.length && sum1 > 0 && sum1 == sum2) {
            return true;
        }
        if(index >= nums.length) return false;

        boolean leftCheck = check(nums, index + 1, sum1 + nums[index], sum2);
        boolean rightCheck = check(nums, index + 1, sum1, sum2 + nums[index]);
        return leftCheck || rightCheck;
    }
}

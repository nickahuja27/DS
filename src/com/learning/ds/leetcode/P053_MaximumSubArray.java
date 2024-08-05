package com.learning.ds.leetcode;

// https://takeuforward.org/data-structure/kadanes-algorithm-maximum-subarray-sum-in-an-array/
// Kadane's Algo
public class P053_MaximumSubArray {
    public static void main(String args[]) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n = arr.length;
        long maxSum = maxSubarraySum(arr);
        System.out.println("The maximum subarray sum is: " + maxSum);
    }

    private static int maxSubarraySum(int[] inArray) {
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;

        for(int i = 0; i < inArray.length; i++) {
            sum += inArray[i];
            maxSum = Math.max(maxSum, sum);
            if(sum < 0)
                sum = 0;
        }
        return maxSum;
    }
}

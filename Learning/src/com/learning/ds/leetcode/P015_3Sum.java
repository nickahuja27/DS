package com.learning.ds.leetcode;

import java.util.Arrays;

public class P015_3Sum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        find3Sum(nums);
    }

    private static void find3Sum(int[] inNums) {
        Arrays.sort(inNums);
        for(int i = 0; i < inNums.length; i++) {
            int start = i + 1;
            int end = inNums.length - 1;
            while (start < end) {
                int workingSum = inNums[start] + inNums[end];
                if (workingSum == -inNums[i]) {
                    System.out.println("Found at: {"+ inNums[i] +", " + inNums[start] + ", " + inNums[end] + "}");
                    break;
                } else if (workingSum > -inNums[i]) {
                    end--;
                } else {
                    start++;
                }
            }
        }
    }
}

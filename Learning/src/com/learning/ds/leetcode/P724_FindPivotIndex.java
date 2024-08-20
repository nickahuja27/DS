package com.learning.ds.leetcode;

import java.util.Arrays;

public class P724_FindPivotIndex {
    public static void main(String[] args) {
        int[] inArray1 = {1,7,3,6,5,6};
        int index1 = pivotIndex(inArray1);
        System.out.println(index1);

        int[] inArray2 = {1,2,3};
        int index2 = pivotIndex(inArray2);
        System.out.println(index2);

        int[] inArray3 = {2,-1,1};
        int index3 = pivotIndex(inArray3);
        System.out.println(index3);
    }

    public static int pivotIndex(int[] nums) {
        int totalSum = Arrays.stream(nums).sum();
        int leftSum = 0;
        int rightSum = 0;
        int pivotIndex = -1;
        for(int i = 0; i < nums.length; i++) {
            if((totalSum - leftSum - nums[i]) == leftSum) {
                pivotIndex = i;
                break;
            }
            leftSum += nums[i];
        }

        return pivotIndex;
    }
}

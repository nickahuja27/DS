package com.learning.ds.blind75.arrays;

public class KadaneAlgo {
    public static void main(String[] args) {
        int[] inArray = {-2,1,-3,4,-1,2,1,-5,4};
        findMaxSubArray(inArray);
    }

    private static void findMaxSubArray(int[] inArray) {
        int workingSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < inArray.length; i++) {
            workingSum += inArray[i];
            if(workingSum < 0)
                workingSum = 0;
            maxSum = Math.max(maxSum, workingSum);
        }

        System.out.println("Max Sum is: " + maxSum);
    }
}

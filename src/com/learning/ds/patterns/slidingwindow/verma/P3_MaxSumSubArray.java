package com.learning.ds.patterns.slidingwindow.verma;

public class P3_MaxSumSubArray {
    public static void main(String[] args) {
        int[] inArray = {2, 5, 1, 8, 2, 9, 1};
        findMaxSum(inArray, 3);
    }

    private static void findMaxSum(int[] inArray, int windowSize) {
        int maxSum = Integer.MIN_VALUE;
        if(windowSize > inArray.length)
            return;

        int start = 0;
        int end = 0;
        int sumSoFar = 0;

        while (end < inArray.length) {
            sumSoFar += inArray[end];
            if(end - start + 1 < windowSize) {
                end++;
            } else if(end - start + 1 == windowSize) {
                System.out.println("Sum: " + sumSoFar);
                maxSum = Math.max(maxSum, sumSoFar);
                sumSoFar -= inArray[start];
                start++;
                end++;
            }
        }

        System.out.println("Max Sum is: " + maxSum);
    }
}

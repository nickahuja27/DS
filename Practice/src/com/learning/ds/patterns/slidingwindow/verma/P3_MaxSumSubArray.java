package com.learning.ds.patterns.slidingwindow.verma;

public class P3_MaxSumSubArray {
    public static void main(String[] args) {
        int[] inArray = {2, 5, 1, 8, 2, 9, 1};
        findMaxSum(inArray, 3);
    }

    private static void findMaxSum(int[] inArray, int windowSize) {
        int start = 0;
        int end = 0;
        int maxSum = 0;
        int workingSum = 0;

        while (end < inArray.length) {
            workingSum += inArray[end];
            if(end - start + 1 < windowSize) {
                end++;
            } else {
                System.out.println("Sum is: " + workingSum);
                maxSum = Math.max(maxSum, workingSum);
                workingSum -= inArray[start];
                start++;
                end++;
            }
        }

        System.out.println("Max sum is: " + maxSum);
    }
}

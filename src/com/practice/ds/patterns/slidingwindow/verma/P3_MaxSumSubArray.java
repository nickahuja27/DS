package com.practice.ds.patterns.slidingwindow.verma;

public class P3_MaxSumSubArray {
    public static void main(String[] args) {
        int[] inArray = {2, 5, 1, 8, 2, 9, 1};
        findMaxSum(inArray, 3);
    }

    private static void findMaxSum(int[] inArray, int windowSize) {
        int left = 0;
        int right = 0;
        int sum = 0;
        int maxSoFar = -1;

        while (right < inArray.length) {
            if(right < windowSize) {
                sum += inArray[right];
                right++;
                continue;
            }
            maxSoFar = Math.max(maxSoFar, sum);
            sum -= inArray[left++];
            sum += inArray[right++];
        }

        System.out.println("Max Sum: " + maxSoFar);
    }
}

package com.practice.ds.patterns.slidingwindow.verma;

public class P1_SumSubarrayOfSizeK {
    public static void main(String[] args) {
        int[] inArray = {2,3,5,2,9,7,1};
        find(inArray, 3);
    }

    private static void find(int[] inArray, int k) {
        int left = 0;
        int right = 0;
        int sumSoFar = 0;

        while (right < inArray.length) {
            if(right < k) {
                sumSoFar += inArray[right];
                right++;
                continue;
            }
            System.out.println("Sum : " + sumSoFar);
            sumSoFar -= inArray[left++];
            sumSoFar += inArray[right++];
        }
        System.out.println("Sum : " + sumSoFar);
    }
}

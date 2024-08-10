package com.learning.ds.patterns.slidingwindow.verma;

public class P1_SumSubarrayOfSizeK {
    public static void main(String[] args) {
        int[] inArray = {2,3,5,2,9,7,1};
        find(inArray, 3);
        System.out.println("---------------------------------------");
        find2(inArray, 3);
    }

    private static void find(int[] inArray, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++) {
            sum += inArray[i];
        }
        System.out.println("Sum: " + sum);
        for(int i = 1; i + k - 1< inArray.length; i++) {
            sum = sum - inArray[i - 1];
            sum += inArray[i + k - 1];
            System.out.println("Sum: " + sum);
        }
    }

    private static void find2(int[] inArray, int K) {
        int sum = 0;
        int start = 0;
        int end = 0;
        while (end < inArray.length) {
            sum += inArray[end];
            if (end - start + 1 < K) {
                end++;
            } else if(end - start + 1 == K){
                System.out.println("Sum: " + sum);
                sum -= inArray[start];
                start++;
                end++;
            }
        }
    }
}

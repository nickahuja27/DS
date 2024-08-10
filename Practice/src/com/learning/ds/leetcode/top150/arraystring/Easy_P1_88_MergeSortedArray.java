package com.learning.ds.leetcode.top150.arraystring;

import java.util.Arrays;

public class Easy_P1_88_MergeSortedArray {
    public static void main(String[] args) {
        int[] inArray1 = {1,2,3,0,0,0};
        int[] inArray2 = {2,5,6};
        merge(inArray1, inArray2, 2, 2);
        System.out.println("Merged Array: " + Arrays.toString(inArray1));
    }

    private static void merge(int[] inArray1, int[] inArray2, int endIdx1, int endIdx2) {
        int counter = inArray1.length - 1;

        while (counter > 0) {
            if (inArray1[endIdx1] >= inArray2[endIdx2]) {
                inArray1[counter--] = inArray1[endIdx1--];
            } else {
                inArray1[counter--] = inArray2[endIdx2--];
            }
        }
    }
}

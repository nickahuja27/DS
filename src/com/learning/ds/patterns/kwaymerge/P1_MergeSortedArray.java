package com.learning.ds.patterns.kwaymerge;

import java.util.Arrays;

public class P1_MergeSortedArray {
    public static void main(String[] args) {
        int[] inArray1 = {1, 2, 7, 92, 0, 0, 0};
        int[] inArray2 = {3, 4, 5};
        merge(inArray1, inArray2, 4);
    }

    private static void merge(int[] inArray1, int[] inArray2, int itemsInFirstArray) {
        int endIndex = inArray1.length - 1;
        int lastIndex1 = itemsInFirstArray - 1;
        int lastIndex2 = inArray2.length - 1;
        for(int i = 0; i < inArray1.length && (lastIndex1 >=0 && lastIndex2 >= 0); i++) {
            if(inArray1[lastIndex1] >= inArray2[lastIndex2]) {
                inArray1[endIndex--] = inArray1[lastIndex1--];
            } else {
                inArray1[endIndex--] = inArray2[lastIndex2--];
            }
        }

        System.out.println("Sorted Array is: "+ Arrays.toString(inArray1));
    }
}

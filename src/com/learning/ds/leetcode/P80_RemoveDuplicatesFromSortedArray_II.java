package com.learning.ds.leetcode;

import java.util.Arrays;

public class P80_RemoveDuplicatesFromSortedArray_II {
    public static void main(String[] args) {
        int[] inArray = {0,0,1,1,1,1,2,3,3};
        int length = removeDuplicates(inArray);
        System.out.println("Length is: " + length);
    }

    private static int removeDuplicates(int[] inArray) {
        int prevNum = Integer.MIN_VALUE;
        int frequency = 0;
        int slowPtr = 0;

        for(int i = 0; i < inArray.length; i++) {
            if(inArray[i] != prevNum) {
                frequency = 1;
                inArray[slowPtr] = inArray[i];
                slowPtr++;
            } else {
                frequency++;
                if(frequency <= 2) {
                    inArray[slowPtr] = inArray[i];
                    slowPtr++;
                }
            }
            prevNum = inArray[i];
        }

        for(int i = slowPtr; i < inArray.length; i++)
            inArray[i] = -1;
        System.out.println("Changed Array is : " + Arrays.toString(inArray));
        return slowPtr;
    }
}

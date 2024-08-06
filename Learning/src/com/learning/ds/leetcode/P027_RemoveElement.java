package com.learning.ds.leetcode;

import java.util.Arrays;

public class P027_RemoveElement {
    public static void main(String[] args) {
        int[] inArray = {0,1,2,2,3,0,4,2};
        int numToRemove = 2;
        remove(inArray, numToRemove);
    }

    private static void remove(int[] inArray, int numToRemove) {
        int slowPtr = 0;
        int fastPtr = 0;

        for(int i = 0; i < inArray.length; i++) {
            if(inArray[fastPtr] != numToRemove) {
                int temp = inArray[slowPtr];
                inArray[slowPtr] = inArray[fastPtr];
                inArray[fastPtr] = temp;
                slowPtr++;
            }
            fastPtr++;
        }

        for(int i = slowPtr; i < inArray.length; i++) {
            inArray[i] = -1;
        }

        System.out.println(Arrays.toString(inArray));
    }
}

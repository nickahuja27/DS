package com.learning.ds.leetcode.top150.arraystring;

import java.util.Arrays;

// Use 2 pointer approach here.

public class Easy_P2_27_RemoveElement {
    public static void main(String[] args) {
        int[] inArray = {0,1,2,2,3,0,4,2};
        remove(inArray, 2);
        System.out.println("Array is:" + Arrays.toString(inArray));
    }

    private static void remove(int[] inArray, int valToRemove) {
        int endCounter = inArray.length - 1;
        for (int i = 0; i < inArray.length; i++) {
            if(inArray[i] == valToRemove) {
                inArray[i] = inArray[endCounter];
                inArray[endCounter] = -1;
                i--;
                endCounter--;
            }
        }
    }
}

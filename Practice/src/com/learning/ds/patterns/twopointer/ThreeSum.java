package com.learning.ds.patterns.twopointer;

import java.util.Arrays;

/*
Find the 3 consecutive numbers whose sum is 0
Do not return DUPLICATE triplets.
a + b + c = 0
b + c = -a
 */
public class ThreeSum {
    public static void main(String[] args) {
        int[] inArray = {-1, 0, 1, 2, -1, -4};
        // Sort so that we can use 2 pointer approach
        Arrays.sort(inArray);
        System.out.println(Arrays.toString(inArray) + "\n\n");
        find(inArray);
    }

    private static void find(int[] inArray) {
    }
}

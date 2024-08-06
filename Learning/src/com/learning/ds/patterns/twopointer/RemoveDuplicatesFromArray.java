package com.learning.ds.patterns.twopointer;

import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] inArray = {0, 0, 1, 1, 1, 2, 2};
        findIndex(inArray);
    }

    private static void findIndex(int[] inArray) {
        int slow = 0;
        int fast = 0;

        while (fast < inArray.length) {
            if(inArray[slow] == inArray[fast])
                fast++;
            else if(inArray[slow] != inArray[fast]) {
                slow++;
                inArray[slow] = inArray[fast];
            }
        }
        System.out.println(Arrays.toString(inArray));
        System.out.println("Indices are Slow: " + slow + ", Fast: " + fast);
    }

}

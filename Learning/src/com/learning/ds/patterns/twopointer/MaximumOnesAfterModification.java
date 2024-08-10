package com.learning.ds.patterns.twopointer;

import java.util.Arrays;

/**
 * https://algo.monster/liteproblems/1004
 */
public class MaximumOnesAfterModification {
    public static void main(String[] args) {
        int[] inArray = {1, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1};
        solution(inArray, 2);
    }

    private static void solution(int[] inArray, int allowedFlips) {
        int left = 0;    // Initialize the left pointer of the window
        int right = 0;   // Initialize the right pointer of the window
        int maxLength = 0;
        int flipsUsed = 0;

        while (right < inArray.length - 1) {
            if(inArray[right] == 0) {
                flipsUsed++;
            }
            right++;
            if(flipsUsed > allowedFlips) {
                // Same logic as used in Variable length sliding Window
                while (flipsUsed > allowedFlips) {
                    if(inArray[left] == 0)
                        flipsUsed--;
                    left++;
                }
            }
            maxLength = Math.max(maxLength, right - left);
        }

        System.out.println("Max length is: " + maxLength);
    }
}

package com.learning.ds.patterns.twopointer;

import java.util.Arrays;

/**
 * https://www.interviewbit.com/problems/maximum-ones-after-modification/
 */
public class MaximumOnesAfterModification {
    public static void main(String[] args) {
        int[] inArray = {1, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1};
        solution(inArray, 2);
    }

    private static void solution(int[] inArray, int allowedFlips) {
        int slow = -1;
        int fast = 0;
        int maxLength = 0;
        int flipsDone = 0;

        while (fast < inArray.length) {
            if(inArray[fast] == 1) {
                fast++;
            } else if(inArray[fast] == 0 && flipsDone < allowedFlips) {
                flipsDone++;
                fast++;
            } else if (inArray[fast] == 0 && flipsDone == allowedFlips) {
                maxLength = Math.max((fast - slow), maxLength);
                slow = fast;
                flipsDone = 0;
            }
        }

        System.out.println("Max length is: " + maxLength);
    }
}

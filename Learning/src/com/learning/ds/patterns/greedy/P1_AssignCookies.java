package com.learning.ds.patterns.greedy;

import java.util.Arrays;

public class P1_AssignCookies {
    public static void main(String[] args) {
        int[] greedFactor = {1,5,3,3,4};
        int[] cookieSize = {4,2,1,2,1,3};
        findNumOfAssignments(greedFactor, cookieSize);
    }

    private static void findNumOfAssignments(int[] greedFactor, int[] cookieSize) {
        Arrays.sort(greedFactor);
        Arrays.sort(cookieSize);
        int numOfAssignments = 0;
        int greedCounter = 0;
        int cookieCounter = 0;

        while (greedCounter <= cookieCounter && greedCounter < greedFactor.length && cookieCounter < cookieSize.length) {
            if(greedFactor[greedCounter] <= cookieSize[cookieCounter]) {
                numOfAssignments++;
                greedCounter++;
            }
            cookieCounter++;
        }

        System.out.println("Number of Assignments: " + numOfAssignments);
    }
}

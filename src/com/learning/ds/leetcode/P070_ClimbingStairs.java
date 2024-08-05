package com.learning.ds.leetcode;

public class P070_ClimbingStairs {
    public static void main(String[] args) {
        int numOfSteps = 3;
        int numOfWays = findWays(numOfSteps);
        System.out.println("Number of ways: " + numOfWays);
    }

    private static int findWays(int numOfSteps) {
        if(numOfSteps == 0) return 1;
        if(numOfSteps < 0) return 0;
        return findWays(numOfSteps - 1) + findWays(numOfSteps - 2);
    }
}

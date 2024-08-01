package com.learning.ds.patterns.greedy;


import java.util.Arrays;

// https://www.educative.io/courses/grokking-coding-interview-patterns-java/boats-to-save-people
public class ED2_BoatsToSavePeople {
    public static void main(String[] args) {
        int[] peopleWeight = {3, 2, 2, 1, 1};
        int weightLimit = 3;
        int numLimit = 2;

        findMinBoats(peopleWeight, weightLimit, numLimit);
    }

    private static void findMinBoats(int[] peopleWeight, int weightLimit, int numLimit) {
        Arrays.sort(peopleWeight);
        int start = 0;
        int end = peopleWeight.length - 1;
        int numOfBoats = 0;

        while (start < end) {
            int currWeight = 0;
            currWeight  = peopleWeight[end--];
            if(currWeight < weightLimit) {
                currWeight += peopleWeight[start++];
            }
            numOfBoats++;
        }

        System.out.println("Min number of boats required: " + numOfBoats);
    }
}

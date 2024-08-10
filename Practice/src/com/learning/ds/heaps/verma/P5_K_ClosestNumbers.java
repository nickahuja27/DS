package com.learning.ds.heaps.verma;

import java.util.PriorityQueue;

public class P5_K_ClosestNumbers {
    public static void main(String[] args) {
        int[] inArray = {5,6,7,8,9};
        int closestOf = 7;
        findClosest(inArray, closestOf, 3);
    }

    private static void findClosest(int[] inArray, int numToCompare, int K) {

    }

    private static class Pair {
        public int difference;
        public int number;
        public Pair(int difference, int number){
            this.difference = difference;
            this.number = number;
        }
    }
}

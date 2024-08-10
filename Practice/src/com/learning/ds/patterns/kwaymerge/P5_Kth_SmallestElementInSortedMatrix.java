package com.learning.ds.patterns.kwaymerge;

import java.util.PriorityQueue;

public class P5_Kth_SmallestElementInSortedMatrix {

    public static void main(String[] args) {
        int[][] inArray = {
                {2,6,8},
                {3,6,10},
                {5,8,11}
        };

        find(inArray, 5);
    }

    private static void find(int[][] inArray, int K) {
    }

    private static class Pair{
        public int number;
        public int row;
        public int index;
        public Pair(int number, int row, int index) {
            this.number = number;
            this.row = row;
            this.index = index;
        }
    }
}

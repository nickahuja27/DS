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
        PriorityQueue<Pair> pQueue = new PriorityQueue<>((p1, p2) -> p1.number - p2.number);
        for(int i = 0; i < inArray.length; i++) {
            pQueue.add(new Pair(inArray[i][0], i, 0));
        }

        while (!pQueue.isEmpty()) {
            Pair pair = pQueue.poll();
            if(pair.index < inArray[pair.row].length - 1) {
                pQueue.add(new Pair(inArray[pair.row][pair.index + 1], pair.row, pair.index + 1));
            }
            K--;
            if(K == 0)
                System.out.println("Kth smallest element is: " + pair.number);
        }
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

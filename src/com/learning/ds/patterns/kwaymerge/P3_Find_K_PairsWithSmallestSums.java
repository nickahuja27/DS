package com.learning.ds.patterns.kwaymerge;

import java.util.List;
import java.util.PriorityQueue;

// https://algo.monster/liteproblems/373
public class P3_Find_K_PairsWithSmallestSums {
    public static void main(String[] args) {
        int[] inArray1 = {3,4,8,9,10,12,13};
        int[] inArray2 = {1,2,5,6};
        int K = 4;
        find(inArray1, inArray2, K);
    }

    private static void find(int[] inArray1, int[] inArray2, int K) {
        PriorityQueue<Pair> pQueue = new PriorityQueue<>((p1, p2) -> p1.sum - p2.sum);
        for(int i = 0; i < Math.min(inArray1.length, K); i++) {
            pQueue.add(new Pair(inArray1[i] + inArray2[0], i, 0));
        }

        while (!pQueue.isEmpty() && K > 0) {
            Pair removedPair = pQueue.remove();
            K--;
            System.out.println("Kth Element is: [" + inArray1[removedPair.index1] + ", " + inArray2[removedPair.index2] + "]");
            if (removedPair.index2 + 1 < inArray2.length) {
                int sum = inArray1[removedPair.index1] + inArray2[removedPair.index2 + 1];
                pQueue.add(new Pair(sum, removedPair.index1, removedPair.index2 + 1));
            }
        }
    }

    private static class Pair{
        public int sum;
        public int index1;
        public int index2;
        public Pair(int sum, int index1, int index2) {
            this.sum = sum;
            this.index1 = index1;
            this.index2 = index2;
        }
    }
}

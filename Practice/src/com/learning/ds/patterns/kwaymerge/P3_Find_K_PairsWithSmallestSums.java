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

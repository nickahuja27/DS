package com.learning.ds.patterns.topKelements;

import java.util.HashMap;
import java.util.PriorityQueue;

public class LC658_Find_K_ClosestPoints {
    public static void main(String[] args) {
        int[] inArray = {1,2,3,4,5,6,7,8,9};
        int K = 4;
        int number = 3;
        find(inArray, K, number);
    }

    private static void find(int[] inArray, int K, int number) {

    }

    private static class Pair{
        public int differnce;
        public int index;
        public Pair(int differnce, int index) {
            this.differnce = differnce;
            this.index = index;
        }
    }
}

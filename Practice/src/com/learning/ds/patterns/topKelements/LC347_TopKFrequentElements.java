package com.learning.ds.patterns.topKelements;

import java.util.HashMap;
import java.util.PriorityQueue;

public class LC347_TopKFrequentElements {
    public static void main(String[] args) {
        int[] inArray = {1,1,1,2,2,3,3,4,4,4,4,4,};
        int K = 2;
        find(inArray, K);
    }

    private static void find(int[] inArray, int K) {
    }

    private static class Pair{
        public int number;
        public int freq;
        public Pair(int number, int freq) {
            this.number = number;
            this.freq = freq;
        }
    }
}

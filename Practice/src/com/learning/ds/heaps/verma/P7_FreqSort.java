package com.learning.ds.heaps.verma;

import java.util.HashMap;
import java.util.PriorityQueue;

public class P7_FreqSort {
    public static void main(String[] args) {
        int[] inArray = {1,1,1,3,2,2,4,4,4,4,4,4,4};
        find(inArray, 2);
    }

    private static void find(int[] inArray, int K) {

    }

    private static class Pair {
        public int frequency;
        public int number;
        public Pair(int number, int frequency){
            this.frequency = frequency;
            this.number = number;
        }
    }
}

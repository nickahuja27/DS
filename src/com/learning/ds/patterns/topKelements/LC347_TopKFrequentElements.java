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
        PriorityQueue<Pair> pQueue = new PriorityQueue<>((p1,p2) -> p1.freq - p2.freq);
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int number : inArray) {
            freqMap.put(number, freqMap.getOrDefault(number, 0) + 1);
        }
        for(int number : freqMap.keySet()) {
            pQueue.add(new Pair(number, freqMap.get(number)));
            if(pQueue.size() > K) {
                pQueue.poll();
            }
        }
        while (!pQueue.isEmpty()) {
            System.out.println(pQueue.poll().number);
        }

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

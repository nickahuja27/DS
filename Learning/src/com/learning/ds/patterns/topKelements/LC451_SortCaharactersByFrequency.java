package com.learning.ds.patterns.topKelements;

import java.util.HashMap;
import java.util.PriorityQueue;

public class LC451_SortCaharactersByFrequency {
    public static void main(String[] args) {
        String inStr = "Aabb";
        sort(inStr);
    }

    private static void sort(String inStr) {
        PriorityQueue<Pair> pQueue = new PriorityQueue<>((p1, p2) -> p2.freq - p1.freq);
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for(char inChar : inStr.toCharArray()) {
            freqMap.put(inChar, freqMap.getOrDefault(inChar, 0) + 1);
        }
        for(char inChar : freqMap.keySet()) {
            pQueue.add(new Pair(inChar, freqMap.get(inChar)));
        }

        StringBuilder sortedString = new StringBuilder();
        while (!pQueue.isEmpty()){
            Pair pair = pQueue.poll();
            for(int i = 0; i < pair.freq; i++) {
                sortedString.append(pair.character);
            }
        }

        System.out.println(sortedString);

    }

    private static class Pair{
        public Character character;
        public int freq;
        public Pair(Character character, int freq) {
            this.character = character;
            this.freq = freq;
        }
    }
}

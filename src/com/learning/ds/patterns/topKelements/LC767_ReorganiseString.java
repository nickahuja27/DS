package com.learning.ds.patterns.topKelements;

import java.util.HashMap;
import java.util.PriorityQueue;

public class LC767_ReorganiseString {
    public static void main(String[] args) {
        String inStr = "aabbccc";
        reorganize(inStr);
    }

    private static void reorganize(String inStr) {
        PriorityQueue<Pair> pQueue = new PriorityQueue<>((p1, p2) -> p2.freq - p1.freq);
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for(char inChar : inStr.toCharArray()) {
            freqMap.put(inChar, freqMap.getOrDefault(inChar, 0) + 1);
        }
        for(char inChar : freqMap.keySet()) {
            pQueue.add(new Pair(inChar, freqMap.get(inChar)));
        }

        Pair prevPair = null;
        StringBuilder builder = new StringBuilder();
        while (!pQueue.isEmpty()){
            Pair pair = pQueue.poll();
            builder.append(pair.character);
            pair.freq--;
            if(prevPair != null && prevPair.freq > 0) {
                pQueue.add(prevPair);
            }
            prevPair = pair;
        }

        System.out.println(builder.toString());
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

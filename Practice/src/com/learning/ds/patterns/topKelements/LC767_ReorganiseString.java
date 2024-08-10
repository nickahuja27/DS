package com.learning.ds.patterns.topKelements;

import java.util.HashMap;
import java.util.PriorityQueue;

public class LC767_ReorganiseString {
    public static void main(String[] args) {
        String inStr = "aabbccc";
        reorganize(inStr);
    }

    private static void reorganize(String inStr) {
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

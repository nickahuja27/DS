package com.learning.ds.patterns.topKelements;

import java.util.HashMap;
import java.util.PriorityQueue;

public class LC451_SortCaharactersByFrequency {
    public static void main(String[] args) {
        String inStr = "Aabb";
        sort(inStr);
    }

    private static void sort(String inStr) {

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

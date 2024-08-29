package com.learning.ds.patterns.slidingwindow.verma;

import java.util.HashMap;

public class P5_CountOccurrencesOfAnagrams {
    public static void main(String[] args) {
        String text = "forxxxorfxdofr";
        String pattern = "for";

        countAnagrams(text, pattern);
    }

    private static void countAnagrams(String text, String pattern) {
        HashMap<Character, Integer> patternMap = new HashMap<>();
        int start = 0;
        int end = 0;
        int anagramCounter = 0;
        int counter = 0;
        for(char c : pattern.toCharArray()) {
            patternMap.put(c, patternMap.getOrDefault(c, 0) + 1);
        }
        counter = patternMap.size();
        char[] inChars = text.toCharArray();
        while (end < text.length()) {
            if(patternMap.get(text.charAt(end)) != null) {
                patternMap.put(inChars[end], patternMap.get(inChars[end]) - 1);
                if(patternMap.get(inChars[end]) == 0)
                    counter--;
            }
            if(end - start + 1 < pattern.length()) {
                end++;
            } else {
                if(counter == 0) {
                    anagramCounter++;
                }
                if(patternMap.get(text.charAt(start)) != null) {
                    if(patternMap.get(text.charAt(start)) == 0) {
                        counter++;
                    }
                    patternMap.put(inChars[start], patternMap.get(inChars[start]) + 1);
                }
                start++;
                end++;
            }
        }

        System.out.println("Number of Anagrams: " + anagramCounter);
    }
}

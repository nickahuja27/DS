package com.practice.ds.patterns.slidingwindow.verma;

import java.util.HashMap;

public class P5_CountOccurrencesOfAnagrams {
    public static void main(String[] args) {
        String text = "forxxxorfxdofr";
        String pattern = "for";

        countAnagrams(text, pattern);
    }

    private static void countAnagrams(String text, String pattern) {
        int start = 0;
        int end = 0;
        int counter = 0;
        int numOfAnagrams = 0;
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        char[] patternChars = pattern.toCharArray();
        for(char patternChar : patternChars) {
            if(charCountMap.get(patternChar) == null)
                counter++;
            charCountMap.put(patternChar, charCountMap.getOrDefault(patternChar, 0) + 1);
        }

        char[] textChars = text.toCharArray();
        while (end < textChars.length) {
            if(charCountMap.get(textChars[end]) != null) {
                int currCount = charCountMap.get(textChars[end]);
                charCountMap.put(textChars[end], currCount - 1);
                if(charCountMap.get(textChars[end]) == 0)
                    counter--;
            }

            if(end - start + 1 < pattern.length()) {
                end++;
            } else if (end - start + 1 == pattern.length()) {
                if(counter == 0) {
                    System.out.println("Anagram Found...");
                    numOfAnagrams++;
                }
                if(charCountMap.get(textChars[start]) != null) {
                    if(charCountMap.get(text.charAt(start)) == 0)
                        counter++;
                    charCountMap.put(textChars[start], charCountMap.get(textChars[start]) + 1);
                }
                start++;
                end++;
            }
        }
        System.out.println("Number of Anagrams: " + numOfAnagrams);
    }
}

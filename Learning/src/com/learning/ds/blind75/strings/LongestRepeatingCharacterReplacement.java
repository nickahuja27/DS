package com.learning.ds.blind75.strings;

import java.util.Comparator;
import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {
    public static void main(String[] args) {
        String inString = "AABABBA";
        int K = 1;
        findLongest(inString, K);
    }

    private static void findLongest(String inString, int K) {
        int start = 0;
        int end = 0;
        HashMap<Character, Integer> charCounterMap = new HashMap<>();
        int maxLength = Integer.MIN_VALUE;

        while (end < inString.length()) {
            char currChar = inString.charAt(end);
            charCounterMap.put(currChar, charCounterMap.getOrDefault(currChar, 0) + 1);
            int maxFreq = getMaxFrequency(charCounterMap);
            int strLength = end - start + 1;
            if(strLength - maxFreq > K) {// This is where you determine number of replacements.
                charCounterMap.put(inString.charAt(start), charCounterMap.get(inString.charAt(start)) - 1);
                start++;
            }
            end++;
            maxLength = Math.max(maxLength, (end - start));
        }

        System.out.println("Max length is: " + maxLength);
    }

    private static int getMaxFrequency(HashMap<Character, Integer> charCounterMap) {
        return charCounterMap.values().stream().max(Comparator.naturalOrder()).get();
    }
}

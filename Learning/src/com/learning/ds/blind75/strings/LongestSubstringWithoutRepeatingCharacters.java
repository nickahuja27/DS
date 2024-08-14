package com.learning.ds.blind75.strings;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        String inString = "abcabcdbb";
        findSubString(inString);
    }

    private static void findSubString(String inString) {
        if(inString.length() == 0) return;

        int maxLength = Integer.MIN_VALUE;
        HashMap<Character, Integer> freqMap = new HashMap<>();
        String resultsString = "";
        char[] inChars = inString.toCharArray();
        for(char inChar : inChars) {
            if(freqMap.containsKey(inChar) && freqMap.get(inChar) > 0) {
                while (freqMap.get(inChar) > 0) {
                    char tempChar = resultsString.charAt(0);
                    freqMap.put(tempChar, freqMap.get(tempChar) - 1);
                    resultsString = resultsString.substring(1);
                }
            }
            freqMap.putIfAbsent(inChar, 0);
            freqMap.put(inChar, freqMap.get(inChar) + 1);
            resultsString += inChar;
            maxLength = Math.max(maxLength, resultsString.length());
        }

        System.out.println("Longest SubString is: " + maxLength);
    }
}

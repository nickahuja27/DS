package com.learning.ds.patterns.slidingwindow.verma;

import java.util.HashMap;

public class P11_VariableSize_LongestSubstringWithNoRepeatingCharacters {
    public static void main(String[] args) {
        find("ABCAABCDEABC");
    }

    private static void find(String inString) {
        HashMap<Character, Integer> charFreq = new HashMap<>();
        int maxLength = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;

        // abcdeccfg
        while (end < inString.length()) {
            int windowLength = end - start + 1;
            charFreq.put(inString.charAt(end), charFreq.getOrDefault(inString.charAt(end), 0) + 1);
            if(windowLength > charFreq.size()) {
                char startChar = inString.charAt(start);
                char endChar = inString.charAt(end);
                while (start < end && windowLength > charFreq.size() && charFreq.get(endChar) != 1) {
                    System.out.println("Start: " + end + ", startChar: " + startChar);
                    System.out.println("End: " + end + ", endChar: " + endChar);
                    charFreq.put(startChar, charFreq.get(inString.charAt(start)) - 1);
                    if(charFreq.get(startChar) == 0) {
                        charFreq.remove(inString.charAt(start));
                    }
                    start++;
                }
            }

            if(windowLength == charFreq.size()) {
                maxLength = Math.max(maxLength, windowLength);
            }
            end++;
        }

        System.out.println("Maximum Length is: " + maxLength);
    }
}

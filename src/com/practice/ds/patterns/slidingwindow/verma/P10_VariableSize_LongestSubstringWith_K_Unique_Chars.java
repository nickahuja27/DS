package com.practice.ds.patterns.slidingwindow.verma;

import java.util.HashMap;

public class P10_VariableSize_LongestSubstringWith_K_Unique_Chars {
    public static void main(String[] args) {
        String inString = "aabacbebebe";
        int uniqueChars = 3;
        find(inString, uniqueChars);
    }

    private static void find(String inString, int uniqueChars) {
        int start = 0;
        int end = 0;
        HashMap<Character, Integer> counterMap = new HashMap<>();
        int maxLength = Integer.MIN_VALUE;

        while (end < inString.length()) {
            counterMap.put(inString.charAt(end), counterMap.getOrDefault(inString.charAt(end), 0) + 1);
            if(counterMap.size() < uniqueChars) {
                end++;
            } else if (counterMap.size() == uniqueChars) {
                System.out.println("Length is: " + (end - start + 1));
                maxLength = Math.max(maxLength, (end - start + 1));
                end++;
            } else if (counterMap.size() > uniqueChars) {
                while (start <= end && counterMap.size() > uniqueChars) {
                    char charToRemove = inString.charAt(start);
                    counterMap.put(charToRemove, counterMap.get(charToRemove) - 1);
                    if(counterMap.get(charToRemove) == 0)
                        counterMap.remove(charToRemove);
                    start++;
                }
                end++;
            }
        }

        System.out.println("Max length is: " + maxLength);
    }
}

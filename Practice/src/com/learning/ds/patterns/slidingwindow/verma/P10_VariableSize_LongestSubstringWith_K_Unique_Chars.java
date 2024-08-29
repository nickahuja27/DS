package com.learning.ds.patterns.slidingwindow.verma;

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
        int maxLength = 0;
        HashMap<Character, Integer> charMap = new HashMap<>();
        char[] inChars = inString.toCharArray();

        while (end < inChars.length) {
            charMap.put(inChars[end], charMap.getOrDefault(inChars[end], 0) + 1);
            int currSize = charMap.size();
            if(currSize < uniqueChars) {
                end++;
            } else if (currSize > uniqueChars) {
                char charToRemove = inChars[start];
                while (charMap.get(charToRemove) != null) {
                    charMap.put(inChars[start], charMap.get(inChars[start]) - 1);
                    if(charMap.get(inChars[start]) == 0) {
                        charMap.remove(inChars[start]);
                    }
                    start++;
                }
                end++;
            } else {
                maxLength = Math.max(maxLength, end - start + 1);
                end++;
            }
        }

        System.out.println("Max length: " + maxLength);
    }
}

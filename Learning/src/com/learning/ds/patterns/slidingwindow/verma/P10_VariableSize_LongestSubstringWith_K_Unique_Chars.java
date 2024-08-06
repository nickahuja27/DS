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
        HashMap<Character, Integer> charCounterMap = new HashMap<>();
        int maxLength = Integer.MIN_VALUE;

        while (end < inString.length()) {
            charCounterMap.put(inString.charAt(end), charCounterMap.getOrDefault(inString.charAt(end), 0) + 1);
            if (charCounterMap.size() < uniqueChars) {
                end++;
            } else if (charCounterMap.size() == uniqueChars) {
                System.out.println("Length is: " + (end - start + 1));
                maxLength = Math.max(maxLength, (end - start + 1));
                end++;
            } else if (charCounterMap.size() > uniqueChars) {
                while (start < end && charCounterMap.size() > uniqueChars) {
                    charCounterMap.put(inString.charAt(start), charCounterMap.get(inString.charAt(start)) - 1);
                    if(charCounterMap.get(inString.charAt(start)) == 0)
                        charCounterMap.remove(inString.charAt(start));
                    start++;
                }
                end++;
            }
        }

        System.out.println("Maximum Length is: " + maxLength);
    }
}

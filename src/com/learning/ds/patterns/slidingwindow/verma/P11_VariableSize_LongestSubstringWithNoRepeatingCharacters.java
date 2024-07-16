package com.learning.ds.patterns.slidingwindow.verma;

import java.util.HashMap;

public class P11_VariableSize_LongestSubstringWithNoRepeatingCharacters {
    public static void main(String[] args) {
        find("ABCABCDEABC");
    }

    private static void find(String inString) {
        int start = 0;
        int end = 0;
        HashMap<Character, Integer> charCounterMap = new HashMap<>();
        int maxLength = 0;

        while (end < inString.length()) {
            charCounterMap.put(inString.charAt(end), charCounterMap.getOrDefault(inString.charAt(end), 0) + 1);
            if(charCounterMap.size() > (end - start + 1)) {
                end++;
            } else if (charCounterMap.size() == (end - start + 1)) {
                System.out.println("Length is: " + (end - start + 1));
                maxLength = Math.max(maxLength, (end - start + 1));
                end++;
            } else if(charCounterMap.size() < (end - start + 1)) {
                System.out.println("Substring is:" + inString.substring(start, end + 1) + "\n");
                // There is no need for  while loop as we are only looking for unique chars.
                //Once we find an existing char, we decrement the count by 1 as we are moving ahead char by char i.e. 1 by 1.
                charCounterMap.put(inString.charAt(end), charCounterMap.get(inString.charAt(end)) - 1);
                start++;
                end++;
            }
        }

        System.out.println("Maximum Length is: " + maxLength);
    }
}

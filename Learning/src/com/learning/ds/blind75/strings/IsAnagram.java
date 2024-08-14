package com.learning.ds.blind75.strings;

import java.util.HashMap;

public class IsAnagram {
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nagaras";
        boolean isAnagram = isAnagram(str1, str2);
        System.out.println(isAnagram);
    }

    private static boolean isAnagram(String str1, String str2) {
        if(str1 == null || str2 == null) return false;
        if(str1.length() != str2.length()) return false;

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for(int i = 0; i < str1.length(); i++) {
            freqMap.put(str1.charAt(i), freqMap.getOrDefault(str1.charAt(i), 0) + 1);
            freqMap.put(str2.charAt(i), freqMap.getOrDefault(str2.charAt(i), 0) - 1);
        }

        for(int count : freqMap.values()) {
            if(count != 0)
                return false;
        }
        return true;
    }
}

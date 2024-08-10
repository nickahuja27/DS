package com.learning.ds.leetcode.top150.arraystring;

import java.util.HashMap;

public class Easy_P5_13_RomanToInteger {
    private static int magnitude[] = {1000, 500, 100, 50, 10, 5, 1};
    private static char symbol[] = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};

    public static void main(String[] args) {
        String romanNumber = "MCMXCIV";
        findNumber(romanNumber);
    }

    private static void findNumber(String romanNumber) {
        int finalNumber = 0;
        HashMap<Character, Integer> romanToValueMap = new HashMap<>();
        for(int i = 0; i < magnitude.length; i++) {
            romanToValueMap.put(symbol[i], magnitude[i]);
        }

        char[] romanChars = romanNumber.toCharArray();
        for(int i = 0; i < romanChars.length; i++) {
            int valueToAdd = 0;
            if(i < romanChars.length - 1 && romanToValueMap.get(romanChars[i]) < romanToValueMap.get(romanChars[i + 1])) {
                valueToAdd = romanToValueMap.get(romanChars[i + 1]) - romanToValueMap.get(romanChars[i]);
                i++;
            } else {
                valueToAdd = romanToValueMap.get(romanChars[i]);
            }
            finalNumber += valueToAdd;
        }

        System.out.println("Integer value is: " + finalNumber);
    }


}

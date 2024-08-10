package com.learning.ds.leetcode;

public class P038_CountAndSay {
    public static void main(String[] args) {
        countAndSay(5);
    }

    private static void countAndSay(int numOfTimes) {
        String result = "1";
        for(int i = 1; i < numOfTimes; i++) {
            result = justSay(result);
            System.out.println("Just say: " + result);
        }
    }

    private static String justSay(String inString) {
        return null;
    }
}

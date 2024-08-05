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
        char prevChar = inString.charAt(0);
        int counter = 1;
        StringBuilder builder = new StringBuilder();
        for(int i = 1; i < inString.length(); i++) {
            if(inString.charAt(i) != prevChar) {
                builder.append(counter).append(prevChar);
                counter = 1;
            } else {
                counter++;
            }
            prevChar = inString.charAt(i);
        }
        builder.append(counter).append(prevChar);
        return builder.toString();
    }
}

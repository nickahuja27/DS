package com.learning.ds.leetcode;

public class P091_DecodeWays {
    public static void main(String[] args) {
        String inString = "226";
        decodeWays(inString, "");
    }

    private static void decodeWays(String inString, String decodedSoFar) {
        if (inString.length() <= 0) {
            System.out.println(decodedSoFar);
            return;
        }

        int singleDigit = Character.getNumericValue(inString.charAt(0));
        decodeWays(inString.substring(1), decodedSoFar + ((char) ('a' + (singleDigit - 1))));
        if (inString.length() >= 2) {
            int doubleDigit = singleDigit * 10 + Character.getNumericValue(inString.charAt(1));
            if (doubleDigit <= 26) {
                decodeWays(inString.substring(2), decodedSoFar + ((char) ('a' + (doubleDigit - 1))));
            }
        }
    }
}

package com.learning.ds.leetcode.top150.arraystring;


/*
JUST READ: https://algo.monster/liteproblems/58
 */
public class Easy_P6_58_LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        // Initialize index 'endIndex' to point to the end of the string.
        int endIndex = s.length() - 1;

        // Skip all the trailing spaces if any.
        while (endIndex >= 0 && s.charAt(endIndex) == ' ') {
            endIndex--;
        }

        // Initialize index 'startIndex' to keep track of the start of the last word.
        int startIndex = endIndex;

        // Move 'startIndex' backwards until we find a space or reach the beginning of the string.
        while (startIndex >= 0 && s.charAt(startIndex) != ' ') {
            startIndex--;
        }

        // The length of the last word is the difference between 'endIndex' and 'startIndex'.
        // We add 1 because 'startIndex' is either pointing to a space or one position off the string.
        return endIndex - startIndex;
    }
}

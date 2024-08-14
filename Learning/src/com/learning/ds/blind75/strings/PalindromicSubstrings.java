package com.learning.ds.blind75.strings;

import java.util.ArrayList;

// https://www.youtube.com/watch?v=4RACzI5-du8&t=704s
public class PalindromicSubstrings {
    public static void main(String[] args) {
        String inString = "aaa";
        ArrayList<String> list = new ArrayList<>();
        findPalindromes(inString, list);
        System.out.println(list);
    }

    private static void findPalindromes(String inString, ArrayList<String> list) {
        int count = 0;

        for(int i = 0; i < inString.length(); i++) {
            int leftPtr = i;
            int rightPtr = i;
            while (leftPtr >=0 &&
                    rightPtr < inString.length() &&
                    inString.charAt(leftPtr) == inString.charAt(rightPtr)) {
                list.add(inString.substring(leftPtr, rightPtr + 1));
                count++;
                leftPtr--;
                rightPtr++;
            }

            leftPtr = i;
            rightPtr = i + 1;
            while (leftPtr >=0 &&
                    rightPtr < inString.length() &&
                    inString.charAt(leftPtr) == inString.charAt(rightPtr)) {
                list.add(inString.substring(leftPtr, rightPtr + 1));
                count++;
                leftPtr--;
                rightPtr++;
            }
        }
        System.out.println("Number of Palindromes: " + count);
    }

    private static boolean isPalindrome(String inString) {
        int startPtr = 0;
        int endPtr = inString.length() - 1;
        while (startPtr <= endPtr) {
            if(inString.charAt(startPtr) != inString.charAt(endPtr)) {
                return false;
            }
            startPtr++;
            endPtr--;
        }
        return true;
    }
}

package com.learning.ds.patterns.subsets;

import java.util.List;

public class P3_LetterCombinationsOfAPhoneNumber {
    public static void main(String[] args) {
        int[] inArray = {2,3,4};
        findCombinations(inArray, 0, "");
    }

    private static void findCombinations(int[] inArray, int index, String outString) {
        if(index >= inArray.length) {
            System.out.print("  " + outString);
            return;
        }

        char[] charsAtIndex = getCharacters(inArray[index]).toCharArray();
        for(int i = 0; i < charsAtIndex.length; i++) {
            findCombinations(inArray, index + 1, outString + charsAtIndex[i]);
        }
    }

    private static String getCharacters(int number) {
        switch (number) {
            case 2:
                return "abc";
            case 3:
                return "def";
            case 4:
                return "ghi";
            case 5:
                return "jkl";
            case 6:
                return "mno";
            case 7:
                return "pqrs";
            case 8:
                return "tuv";
            case 9:
                return "wxyz";
            default:
                return "";
        }
    }
}

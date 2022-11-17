package com.learning.ds.recursion.ib;

import java.util.ArrayList;

public class LetterPhone {
    private static char[][] charMapArray = {{},{},
                                    {'a', 'b', 'c'},
            {'d', 'e', 'f'},
            {'g', 'h', 'i'},
            {'j', 'k', 'l'},
            {'m', 'n', 'o'},
            {'p', 'q','r','s'},
            {'t','u','v'},
            {'w','x','y','z'}};

    public static void main(String[] args) {
        findCombinations(0, "234", new ArrayList<>());
    }

    private static void findCombinations(int index, String inNumbers, ArrayList<Character> combinationList) {
        if(index == inNumbers.length()) {
            System.out.println(combinationList);
            return;
        }

        int workingNumber = Integer.parseInt("" + inNumbers.charAt(index));
        char[] currLetters = charMapArray[workingNumber];
        for(int i = 0; i < currLetters.length; i++) {
            combinationList.add(currLetters[i]);
            findCombinations(index + 1, inNumbers, combinationList);
            combinationList.remove(combinationList.size() - 1);
        }
    }
}

package com.learning.ds.patterns.subsets;

import java.util.Arrays;

public class P2_Permutations {
    public static void main(String[] args) {
        String inString = "bad";
        permutate(inString.toCharArray(), 0);
    }

    private static void permutate(char[] inArray, int index) {

    }

    private static void swap(char[] inArray, int i, int j) {
        char temp = inArray[i];
        inArray[i] = inArray[j];
        inArray[j] = temp;
    }
}

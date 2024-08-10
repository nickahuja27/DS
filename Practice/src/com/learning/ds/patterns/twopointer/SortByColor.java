package com.learning.ds.patterns.twopointer;

import java.util.Arrays;

public class SortByColor {
    public static void main(String[] args) {
        int[] inArray = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        solution(inArray);
    }

    private static void solution(int[] inArray) {

    }

    private static void swap(int[] inArray, int i, int j) {
        int temp = inArray[i];
        inArray[i] = inArray[j];
        inArray[j] = temp;
    }
}

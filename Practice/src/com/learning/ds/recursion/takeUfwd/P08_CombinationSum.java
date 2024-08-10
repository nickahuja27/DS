package com.learning.ds.recursion.takeUfwd;

import java.util.ArrayList;

public class P08_CombinationSum {
    public static void main(String[] args) {
        int[] inArray = {2,3,6,7};
        int TARGET = 7;
        printCombinations(0, inArray, new ArrayList<Integer>(), 0, TARGET);
    }

    private static void printCombinations(int index, int[] inArray, ArrayList<Integer> workingList, int workingSum, int TARGET) {

    }
}

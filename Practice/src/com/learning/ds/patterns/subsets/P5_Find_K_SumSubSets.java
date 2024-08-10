package com.learning.ds.patterns.subsets;

import java.util.ArrayList;
import java.util.List;

public class P5_Find_K_SumSubSets {
    public static void main(String[] args) {
        int[] inArray = {1,3,5,21,19,7,2};
        int sumToFind = 10;
        findSubsets(inArray, 0, sumToFind, 0, new ArrayList<Integer>());
    }

    private static void findSubsets(int[] inArray, int index, int sumToFind, int sumSoFar, List<Integer> results) {

    }
}

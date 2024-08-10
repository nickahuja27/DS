package com.learning.ds.recursion.takeUfwd;

import java.util.ArrayList;

public class P07_GetCountOfSubsequenceWithSum {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        int SUM = 2;
        int numOfSubSequences = printSubSequences(0, arr, new ArrayList<Integer>(), 0, SUM);
        System.out.println("Number of Sub Sequences: " + numOfSubSequences);
    }

    private static int printSubSequences(int index, int[] inArray, ArrayList<Integer> workingList, int workingSum, int SUM) {
        return -1;
    }
}

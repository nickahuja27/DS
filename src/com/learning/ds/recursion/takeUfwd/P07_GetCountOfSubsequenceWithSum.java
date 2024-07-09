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
        if(index == inArray.length) {
            if(workingSum == SUM) {
                System.out.println(workingList);
                return 1;
            }
            return 0;    
        }

        workingList.add(inArray[index]);
        int leftCount = printSubSequences(index + 1, inArray, workingList, workingSum + inArray[index], SUM);
        workingList.remove(workingList.size() - 1);
        int rightCount = printSubSequences(index + 1, inArray, workingList, workingSum, SUM);
        return leftCount + rightCount;
    }
}

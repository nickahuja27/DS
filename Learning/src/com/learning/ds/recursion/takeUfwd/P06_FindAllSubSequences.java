package com.learning.ds.recursion.takeUfwd;

import java.util.ArrayList;

public class P06_FindAllSubSequences {
    public static void main(String[] args) {
        int[] arr = {3,1,2};
        printSubSequences(0, arr, new ArrayList<Integer>());
    }

    private static void printSubSequences(int index, int[] inArray, ArrayList<Integer> workingList) {
        if(index >= inArray.length) {
            System.out.println(workingList.toString());
            return;
        }
        workingList.add(inArray[index]);
        printSubSequences(index + 1, inArray, workingList);
        workingList.remove(workingList.size() - 1);
        printSubSequences(index + 1, inArray, workingList);
    }
}

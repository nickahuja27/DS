package com.learning.ds.recursion.takeUfwd;

import java.util.ArrayList;

public class P11_SubsetSum_2 {
public static void main(String[] args) {
        int[] inArray = {1,2,2};
        printSubsets2(0, inArray, new ArrayList<Integer>());
    }

    private static void printSubsets2(int index, int[] inArray, ArrayList<Integer> workingList) {
        System.out.println(workingList);
        for(int i = index; i < inArray.length; i++) {
            if (i > index && inArray[i] == inArray[i-1]) {
                continue;
            }

            workingList.add(inArray[i]);
            printSubsets2(i + 1, inArray, workingList);
            workingList.remove(workingList.size() - 1);
        }
    }
}

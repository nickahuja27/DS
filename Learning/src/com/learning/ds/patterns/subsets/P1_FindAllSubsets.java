package com.learning.ds.patterns.subsets;

import java.util.ArrayList;
import java.util.List;

public class P1_FindAllSubsets {
    public static void main(String[] args) {
        int[] inArray = {3,6,9};
        findSubsets(inArray, 0, new ArrayList<Integer>());

    }

    private static void findSubsets(int[] inArray, int index, List<Integer> resultsList) {
        if(index >= inArray.length) {
            System.out.println(resultsList);
            return;
        }

        resultsList.add(inArray[index]);
        findSubsets(inArray, index + 1, resultsList);
        resultsList.remove(resultsList.size() - 1);
        findSubsets(inArray, index + 1, resultsList);
    }
}

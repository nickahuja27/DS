package com.learning.ds.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P040_Combination_Sum_II {
    public static void main(String[] args) {
        int[] inArray = {10,1,2,7,6,1,5};
        Arrays.sort(inArray);
        int target = 8;
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> retList = new ArrayList<>();
        combinationSum2(inArray, target, 0, list, retList, 0);
    }

    private static void combinationSum2(int[] inArray, int target, int index, List<Integer> workingList, List<List<Integer>> retList, int sumSoFar) {
        if(sumSoFar == target) {
            System.out.println("Ans: " + workingList);
            retList.add(new ArrayList(workingList));
            return;
        }
        if(index >= inArray.length || sumSoFar > target) {
            return;
        }

        for(int i = index;i < inArray.length; i++) {
            if(i > index && inArray[i] == inArray[i-1])
                continue;
            workingList.add(inArray[i]);
            combinationSum2(inArray, target, i + 1, workingList, retList, sumSoFar + inArray[i]);
            workingList.remove(workingList.size() - 1);
        }
    }
}

package com.learning.ds.leetcode;

import java.util.ArrayList;
import java.util.List;

public class P39_CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        List<Integer> workingList = new ArrayList<>();
        List<List<Integer>> retList = new ArrayList<>();
        combinationSum(candidates, target, 0, workingList, 0);
    }

    private static void combinationSum(int[] inArray, int target, int index, List<Integer> list, int sumSoFar) {
        if(sumSoFar == target) {
            System.out.println(list);
            return;
        }
        if(sumSoFar > target || index >= inArray.length) return;

        list.add(inArray[index]);
        combinationSum(inArray, target, index, list, sumSoFar + inArray[index]);
        list.remove(list.size() - 1);
        combinationSum(inArray, target, index + 1, list, sumSoFar);
    }

    private static void combinationSum1(int[] inArray, int index, int target, int workingSum,
                                       List<Integer> workingList, List<List<Integer>> retList) {
        if(workingSum == target) {
            retList.add(new ArrayList<>(workingList));
            System.out.println(workingList);
            return;
        }
        if(workingSum > target || index >= inArray.length) {
            return;
        }

        workingList.add(inArray[index]);
        combinationSum1(inArray, index, target, workingSum + inArray[index], workingList, retList);
        workingList.remove(workingList.size() - 1);

        combinationSum1(inArray, index + 1, target, workingSum + inArray[index], workingList, retList);

    }
}

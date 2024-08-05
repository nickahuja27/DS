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
        findCombinations(inArray, target, 0, list, 0);
    }

    private static void findCombinations(int[] inArray, int target, int index, List<Integer> list, int sumSoFar) {
        if(sumSoFar == target) {
            System.out.println(list);
            return;
        }
        if(sumSoFar > target || index >= inArray.length) return;

        list.add(inArray[index]);
        findCombinations(inArray, target, index + 1, list, sumSoFar + inArray[index]);
        list.remove(list.size() - 1);
        findCombinations(inArray, target, index + 1, list, sumSoFar);
    }
}

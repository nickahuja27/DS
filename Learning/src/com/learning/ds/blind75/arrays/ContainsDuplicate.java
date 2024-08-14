package com.learning.ds.blind75.arrays;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] inArray = {1, 2, 3, 1};
        boolean hasDuplicate = findDuplicate(inArray);
        System.out.println(hasDuplicate);
    }

    private static boolean findDuplicate(int[] inArray) {
        HashSet<Integer> numSet = new HashSet<>();
        for(int num : inArray) {
            numSet.add(num);
        }

        return numSet.size() < inArray.length;
    }
}

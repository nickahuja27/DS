package com.learning.ds.leetcode;

import java.util.ArrayList;
import java.util.List;

public class P077_Combinations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        findCombinations(4, 2, 1,list);
    }

    private static void findCombinations(int numRange, int K, int index, List<Integer> combinationsSoFar) {
        if(combinationsSoFar.size() == K){
            System.out.println(combinationsSoFar);
            return;
        }
        for(int i = index; i <= numRange; i++) {
            combinationsSoFar.add(i);
            findCombinations(numRange, K, i + 1, combinationsSoFar);
            combinationsSoFar.remove(combinationsSoFar.size() - 1);
        }
    }
}

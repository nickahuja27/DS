package com.learning.ds.recursion.takeUfwd;

import java.util.ArrayList;
import java.util.Arrays;

//BFS
public class P13_PrintAllPermutationsOfAnArray {
    public static void main(String[] args) {
        int[] inArray = {1, 2, 3};
        printPermutations(0, inArray);
      }
    
    private static void printPermutations(int index, int[] inArray) {

    }
    private static void swap(int[] inArray, int x, int y) {
        int temp = inArray[x];
        inArray[x] = inArray[y];
        inArray[y] = temp;
    }
}

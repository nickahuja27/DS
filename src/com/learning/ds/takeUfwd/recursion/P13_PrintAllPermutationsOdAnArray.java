package com.learning.ds.takeUfwd.recursion;

import java.util.Arrays;

public class P13_PrintAllPermutationsOdAnArray {
  public static void main(String[] args) {
    int[] inArray = {1, 2, 3};
    printPermutations(0, inArray);
  }

  private static void printPermutations(int index, int[] inArray) {
    if(index >= inArray.length) {
      System.out.println(Arrays.toString(inArray));
    }

    for(int i = index; i < inArray.length; i++) {
      swap(inArray, index, i);
      printPermutations(index + 1, inArray);
      swap(inArray, index, i);
    }
  }

  private static void swap(int[] inArray, int x, int y) {
    int temp = inArray[x];
    inArray[x] = inArray[y];
    inArray[y] = temp;
  }
}

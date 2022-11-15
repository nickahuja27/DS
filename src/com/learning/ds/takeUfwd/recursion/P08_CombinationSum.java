package com.learning.ds.takeUfwd.recursion;

import java.util.ArrayList;

public class P08_CombinationSum {
  private static int TARGET = 7;

  public static void main(String[] args) {
    int[] inArray = {2, 3, 6, 7};
    printCombinations(0, inArray, new ArrayList<>(), 0);
  }

  private static void printCombinations(int index, int[] inArray, ArrayList<Integer> seqSofar, int sumSoFar) {
    if (sumSoFar == TARGET) {
      System.out.println("Combination is: " + seqSofar);
      return;
    }
    if(sumSoFar > TARGET || index >= inArray.length) {
      return;
    }

    seqSofar.add(inArray[index]);
    printCombinations(index, inArray, seqSofar, sumSoFar + inArray[index]);
    seqSofar.remove(seqSofar.size() - 1);
    printCombinations(index + 1, inArray, seqSofar, sumSoFar);
  }
}

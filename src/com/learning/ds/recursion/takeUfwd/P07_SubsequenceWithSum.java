package com.learning.ds.recursion.takeUfwd;

import java.util.ArrayList;

public class P07_SubsequenceWithSum {
  private static int SUM = 2;

  public static void main(String[] args) {
    int[] inArray = {1, 2, 1};
    printSubSequences(0, inArray, new ArrayList<>(), 0);
  }

  private static void printSubSequences(int index, int[] inArray, ArrayList<Integer> seqSoFar, int sumSoFar) {
    if(index >= inArray.length) {
      if(sumSoFar == SUM)
        System.out.println(seqSoFar);
      return;
    }

    seqSoFar.add(inArray[index]);
    printSubSequences(index + 1, inArray, seqSoFar, sumSoFar + inArray[index]);
    seqSoFar.remove(seqSoFar.size() - 1);
    printSubSequences(index + 1, inArray, seqSoFar, sumSoFar);
  }

}

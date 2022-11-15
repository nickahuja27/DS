package com.learning.ds.takeUfwd.recursion;

import java.util.ArrayList;

public class P07_PrintAnySubsequenceWithSum {
  private static int SUM = 2;

  public static void main(String[] args) {
    int[] inArray = {1, 2, 1};
    printSubSequences(0, inArray, new ArrayList<>(), 0);
  }

  private static boolean printSubSequences(int index, int[] inArray, ArrayList<Integer> seqSoFar, int sumSoFar) {
    if(index >= inArray.length) {
      if (sumSoFar == SUM) {
        System.out.println(seqSoFar);
        return true;
      }
      return false;
    }

    seqSoFar.add(inArray[index]);
    boolean seqFound = printSubSequences(index + 1, inArray, seqSoFar, sumSoFar + inArray[index]);
    if(seqFound)
      return seqFound;
    seqSoFar.remove(seqSoFar.size() - 1);
    seqFound = printSubSequences(index + 1, inArray, seqSoFar, sumSoFar);
    if(seqFound)
      return seqFound;

    return false;
  }

}

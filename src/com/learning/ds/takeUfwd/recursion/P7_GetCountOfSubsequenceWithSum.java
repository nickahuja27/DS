package com.learning.ds.takeUfwd.recursion;

import java.util.ArrayList;

public class P7_GetCountOfSubsequenceWithSum {
  private static int SUM = 2;

  public static void main(String[] args) {
    int[] inArray = {1, 2, 1};
    int count = printSubSequences(0, inArray, new ArrayList<>(), 0);
    System.out.println("Number of Subsequences are:  " + count);
  }

  private static int printSubSequences(int index, int[] inArray, ArrayList<Integer> seqSoFar, int sumSoFar) {
    if(index >= inArray.length) {
      if (sumSoFar == SUM) {
        System.out.println(seqSoFar);
        return 1;
      }
      return 0;
    }

    seqSoFar.add(inArray[index]);
    int leftCount = printSubSequences(index + 1, inArray, seqSoFar, sumSoFar + inArray[index]);
    seqSoFar.remove(seqSoFar.size() - 1);
    int rightCount = printSubSequences(index + 1, inArray, seqSoFar, sumSoFar);

    return leftCount + rightCount;
  }
}

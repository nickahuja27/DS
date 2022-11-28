package com.learning.ds.recursion.ib;

import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSum2 {
  public static void main(String[] args) {
    int[] inArray = {10,1,2,7,6,1,5};
    Arrays.sort(inArray);
    findCombinations(0, inArray, 8, 0, new ArrayList<>());
  }

  private static void findCombinations(int index, int[] inArray, int sum, int sumSoFar, ArrayList<Integer> seqSofar) {
    if (sumSoFar == sum) {
      System.out.println(seqSofar);
      return;
    }

    if (index == inArray.length || sumSoFar > sum) {
      return;
    }

    seqSofar.add(inArray[index]);
    findCombinations(index + 1, inArray, sum, sumSoFar + inArray[index], seqSofar);
    seqSofar.remove(seqSofar.size() - 1);
    findCombinations(index + 1, inArray, sum, sumSoFar, seqSofar);
  }
}

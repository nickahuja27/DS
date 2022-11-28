package com.learning.ds.recursion.ib;

import java.util.ArrayList;

public class CombinationSum {
  private static int counter = 0;

  public static void main(String[] args) {
    int[] inArray = {2, 3, 6, 7};
    findCombinations(0, inArray, 7, 0, new ArrayList<>());
    System.out.println("Number of combinations available: " + counter);
  }

  private static void findCombinations(int index, int[] inArray, int sum, int sumSoFar, ArrayList<Integer> seqSofar) {
    if (sumSoFar == sum) {
      counter++;
      System.out.println(seqSofar);
      return;
    }

    if (index == inArray.length || sumSoFar > sum) {
      return;
    }

    seqSofar.add(inArray[index]);
    findCombinations(index, inArray, sum, sumSoFar + inArray[index], seqSofar);
    seqSofar.remove(seqSofar.size() - 1);
    findCombinations(index + 1, inArray, sum, sumSoFar, seqSofar);
  }
}

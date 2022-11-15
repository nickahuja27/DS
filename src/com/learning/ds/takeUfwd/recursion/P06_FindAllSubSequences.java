package com.learning.ds.takeUfwd.recursion;

import java.util.ArrayList;

public class P06_FindAllSubSequences {
  public static void main(String[] args) {
    int[] inArray = {3,1,2};
    printSubSequences(0, inArray, new ArrayList<>());
  }

  private static void printSubSequences(int index, int[] inArray, ArrayList<Integer> outputSoFar) {
    if(index >= inArray.length) {
      System.out.println(outputSoFar);
      return;
    }

    outputSoFar.add(inArray[index]);
    printSubSequences(index + 1, inArray, outputSoFar);
    outputSoFar.remove(outputSoFar.size() - 1);
    printSubSequences(index + 1, inArray, outputSoFar);
  }
}

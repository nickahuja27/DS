package com.learning.ds.recursion.ib;

import java.util.ArrayList;

public class Subset {
  public static void main(String[] args) {
    int[] inArray = {1,2,3};
    getSubsets(0, inArray, new ArrayList<>());
  }

  private static void getSubsets(int index, int[] inArray, ArrayList<Integer> resultsSoFar) {
    if(index == inArray.length) {
      System.out.println(resultsSoFar);
      return;
    }
    resultsSoFar.add(inArray[index]);
    getSubsets(index + 1, inArray, resultsSoFar);
    resultsSoFar.remove(resultsSoFar.size() - 1);
    getSubsets(index + 1, inArray, resultsSoFar);

  }
}

package com.learning.ds.recursion.ib;

import java.util.ArrayList;

public class AllPossibleCombinations {
  public static void main(String[] args) {
    String[] inArray = {"ab", "cd", "ef"};
    combinations(0, inArray, new ArrayList<>());
  }

  private static void combinations(int index, String[] inArray, ArrayList<String> resultSoFar) {
    if(index == inArray.length) {
      System.out.println(resultSoFar);
      return;
    }

    String currStr = inArray[index];
    for(int i = 0; i < currStr.length(); i++) {
      resultSoFar.add("" + currStr.charAt(i));
      combinations(index + 1,  inArray, resultSoFar);
      resultSoFar.remove(resultSoFar.size() - 1);
    }
  }
}

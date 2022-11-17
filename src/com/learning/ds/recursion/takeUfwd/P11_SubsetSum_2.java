package com.learning.ds.recursion.takeUfwd;

import java.util.ArrayList;
import java.util.List;

public class P11_SubsetSum_2 {
  public static void main(String[] args) {
    int[] inArray = {1,2,2};
    List<List<Integer>> resultsList = new ArrayList<>();
    printSubsets2(0, inArray, resultsList, new ArrayList<>());
    System.out.println(resultsList);
  }

  private static void printSubsets2(int index, int[] inArray, List<List<Integer>> resultsList, List<Integer> workingList) {
    resultsList.add(new ArrayList<>(workingList));
    for(int i = index; i < inArray.length; ++i) {
      if(i > index && inArray[i] == inArray[i - 1])
        continue;
      workingList.add(inArray[i]);
      printSubsets2(i + 1, inArray, resultsList, workingList);
      workingList.remove(workingList.size() - 1);
    }
  }
}

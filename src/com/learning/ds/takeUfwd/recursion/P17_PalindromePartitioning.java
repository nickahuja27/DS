package com.learning.ds.takeUfwd.recursion;

import java.util.ArrayList;

public class P17_PalindromePartitioning {
  public static void main(String[] args) {
    partition(0, "aabb", new ArrayList<>());
  }

  private static void partition(int index, String workingStr, ArrayList<String> resultsList) {
    if(index == workingStr.length()) {
      System.out.println(resultsList);
      return;
    }

    for (int i = index; i < workingStr.length(); i++) {
      String partitionedStr = workingStr.substring(index, i + 1);
      if (isPalindrome(partitionedStr)) {
        resultsList.add(partitionedStr);
        partition(i + 1, workingStr, resultsList);
        resultsList.remove(resultsList.size() - 1);
      }
    }
  }

  private static boolean isPalindrome(String inString) {
    StringBuilder reversedString = new StringBuilder(inString).reverse();
    return inString.equals(reversedString.toString());
  }
}

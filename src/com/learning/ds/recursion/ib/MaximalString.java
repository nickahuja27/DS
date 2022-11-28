package com.learning.ds.recursion.ib;

public class MaximalString {
  private static int maxNum = Integer.MIN_VALUE;
  private static int maxSwaps = 2;

  public static void main(String[] args) {
    int[] inArray = {2, 5, 4};
    int maxValue = findMax(0, inArray, 0, Integer.MIN_VALUE);
    System.out.println("Max Number that can be made is: " + maxValue);
  }

  private static int findMax(int index, int[] inArray, int currSwaps, int maxSoFar) {
    if(currSwaps == maxSwaps) {
      int currValue = toInt(inArray);
      return Math.max(maxSoFar, currValue);
    }
    if(index == inArray.length) {
      return maxSoFar;
    }

    for(int i = index; i < inArray.length; i++) {
      swap(inArray, index, i);
      int currValue = findMax(index + 1, inArray, currSwaps + 1, maxSoFar);
      maxSoFar = Math.max(currValue, maxSoFar);
      swap(inArray, index, i);
    }
    return maxSoFar;
  }

  private static void swap(int[] inArray, int x, int y) {
    int temp = inArray[x];
    inArray[x] = inArray[y];
    inArray[y] = temp;
  }

  private static int toInt(int[] inArray) {
    int nbr = 0;
    for(int i = 0; i < inArray.length;i++)
      nbr = nbr*10 + inArray[i];

    return nbr;
  }
}

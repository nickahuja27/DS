package com.template.ds.patterns.slidingwindow.verma;

/*
  while(j < size) {
    1. Do the calculations here.
    if(condition < k) {
      j++
    }
    if (condition > k) { // Write this condition first. If after deletion, you reach required SUM, then it will be handled by below statement.
      while(condition > k) {
        3. remove calculations for i
        i++
      }
    }
    if(condition == k) {
      2. Answer Calculations
      j++
    }
  }
 */
public class P8_VariableSize_LargestSubArrayOfSum_K {
    public static void main(String[] args) {
        int[] inArray = {4, 1, 1, 1, 2, 3, 5};
        int sumToFind = 5;
        findLargest(inArray, sumToFind);
    }


    private static void findLargest(int[] inArray, int sumToFind) {

    }
}

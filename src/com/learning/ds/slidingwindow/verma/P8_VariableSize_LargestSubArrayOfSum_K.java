package com.learning.ds.slidingwindow.verma;

/*
  while(j < size) {
    1. Do the calculations here.
    if(condition < k) {
      j++
    }
    else if(condition == k) {
      2. Answer Calculations
      j++
    }
    else if (condition > k) {
      while(condition > k) {
        3. remove calculations for i
        i++
      }
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
    int i = 0;
    int j = 0;

    int maxLength = 0;
    int sumSoFar = 0;

    while (j < inArray.length) {
      sumSoFar += inArray[j];
      if(sumSoFar < sumToFind) {
        j++;
      } else if(sumSoFar == sumToFind) {
        System.out.println("Length here is: " + (j - i + 1));
        maxLength = Math.max(maxLength, (j - i + 1));
        j++;
      } else {
        while (sumSoFar > sumToFind) {
          sumSoFar = sumSoFar - inArray[i];
          i++;
        }
        // There is a possibility that after this step, the sumSoFar == sumToFind
        // We can ignore this equality here because maxLength can never be greater than before.
        // Think about, we are removing integers from front, then length should decrease here.
        // The max so far length may have occurred before
        // case is sum of (2, 3)
        j++;
      }
    }

    System.out.println("Max length is : " + maxLength);
  }
}

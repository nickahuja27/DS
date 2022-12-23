package com.learning.ds.slidingwindow.educative;

import java.util.LinkedList;
import java.util.Queue;

public class P1_FindMaxInSubArrays {
  public static void main(String[] args) {
    int[] inArray = {1, 3, -1, -3, 5, 3, 6, 7};
    findMax(inArray, 3);
  }

  private static void findMax(int[] inArray, int windowSize) {
    int i = 0;
    int j = 0;
    Queue<Integer> queue = new LinkedList<>();

    while (j < inArray.length) {
      while (!queue.isEmpty() && queue.peek() < inArray[j]) {
        queue.poll();
      }
      queue.add(inArray[j]);

      if((j - i + 1) < windowSize) {
        j++;
      } else if((j - i + 1) == windowSize) {
        System.out.println("Max num in this SubArray: " + queue.peek());
        i++;
        j++;
      }
    }
  }
}

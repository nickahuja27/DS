package com.learning.ds.slidingwindow.verma;

import java.util.LinkedList;
import java.util.Queue;

public class P4_FirstNegativeNum {
  public static void main(String[] args) {
    int[] inArray = {12, -1, -7, 8, -15, 30, 16, 28};
    findFirstNegative(inArray, 3);
  }

  private static void findFirstNegative(int[] inArray, int windowSize) {
    int i = 0;
    int j = 0;

    Queue<Integer> queue = new LinkedList<>();

    while (j < inArray.length) {
      //Do the calculations. This is done using the j/end or forward pointer.
      if(inArray[j] < 0) {
        queue.add(inArray[j]);
      }

      if (j - i + 1 < windowSize) {
        j++;
      } else if(j - i + 1 == windowSize) {
        // Find the answer here.
        System.out.println("Negative Num: " + queue.peek());

        //Remove the values corresponding the i or start pointer
        if(!queue.isEmpty() && inArray[i] == queue.peek()) {
          queue.poll();
        }

        // Slide the window now.
        i++;
        j++;
      }
    }
  }
}

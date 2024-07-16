package com.learning.ds.patterns.slidingwindow.verma;

import java.util.LinkedList;
import java.util.Queue;

public class P4_FirstNegativeNum {
    public static void main(String[] args) {
        int[] inArray = {12, -1, -7, 8, -15, 30, 16, 28};
        findFirstNegative(inArray, 3);
    }

    private static void findFirstNegative(int[] inArray, int windowSize) {
        Queue<Integer> queue = new LinkedList<>();
        int start = 0;
        int end = 0;
        while (end < inArray.length) {
            if(inArray[end] < 0)
                queue.add(inArray[end]);
            if (end - start + 1 < windowSize) {
                end++;
            } else if(end - start + 1 == windowSize) {
                // Find the answer here.
                System.out.println(queue.peek());
                //Remove the values corresponding the start pointer
                if(!queue.isEmpty() && queue.peek() == inArray[start])
                    queue.remove();
                // Slide the window now.
                start++; end++;
            }
        }
    }
}

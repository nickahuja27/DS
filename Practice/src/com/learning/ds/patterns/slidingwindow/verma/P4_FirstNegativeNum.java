package com.learning.ds.patterns.slidingwindow.verma;

import java.util.LinkedList;
import java.util.Queue;

public class P4_FirstNegativeNum {
    public static void main(String[] args) {
        int[] inArray = {12, -1, -7, 8, -15, 30, 16, 28};
        findFirstNegative(inArray, 3);
    }

    private static void findFirstNegative(int[] inArray, int windowSize) {
        int start = 0;
        int end = 0;
        Queue<Integer> queue = new LinkedList<>();
        while (end < inArray.length) {
            if(inArray[end] < 0)
                queue.add(inArray[end]);
            if(end - start + 1 < windowSize) {
                end++;
            } else {
                if(!queue.isEmpty()) {
                    System.out.println("Number: " + queue.peek());
                    if(queue.peek() == inArray[start])
                        queue.poll();
                } else {
                    System.out.println("Number: -1");
                }

                start++;
                end++;
            }
        }
    }
}

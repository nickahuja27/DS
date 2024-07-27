package com.practice.ds.patterns.slidingwindow.verma;

import java.util.LinkedList;
import java.util.Queue;

public class P4_FirstNegativeNum {
    public static void main(String[] args) {
        int[] inArray = {12, -1, -7, 8, -15, 30, 16, 28};
        findFirstNegative(inArray, 3);
    }

    private static void findFirstNegative(int[] inArray, int windowSize) {
        Queue<Integer> queue = new LinkedList<>();
        int left = 0;
        int right = 0;

        while (right < inArray.length) {
            if(inArray[right] < 0)
                queue.add(inArray[right]);

            if(right - left + 1 < windowSize) {
                right++;
            } else if(right - left + 1 == windowSize) {
                System.out.println("Number: " + queue.peek());
                if(!queue.isEmpty() && inArray[left] == queue.peek())
                    queue.remove();
                left++;
                right++;
            }
        }
    }
}

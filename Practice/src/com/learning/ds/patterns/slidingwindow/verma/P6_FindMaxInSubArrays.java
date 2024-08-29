package com.learning.ds.patterns.slidingwindow.verma;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class P6_FindMaxInSubArrays {
    public static void main(String[] args) {
        int[] inArray = {1, 3, -1, -3, -5, 3, 6, 7};
        findMax(inArray, 3);
    }

    private static void findMax(int[] inArray, int windowSize) {
        int start = 0;
        int end = 0;
        List<Integer> ansList = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        while (end < inArray.length) {
            while (!queue.isEmpty() && queue.peek() <= inArray[end]) {
                queue.poll();
            }
            queue.add(inArray[end]);
            if(end - start + 1 < windowSize) {
                end++;
            } else {
                ansList.add(queue.peek());
                if(queue.peek() == inArray[start]) {
                    queue.poll();
                }
                start++;
                end++;
            }
        }

        System.out.println("Max numbers are: " + ansList);
    }
}

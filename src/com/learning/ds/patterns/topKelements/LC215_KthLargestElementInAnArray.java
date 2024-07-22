package com.learning.ds.patterns.topKelements;

import java.util.PriorityQueue;

public class LC215_KthLargestElementInAnArray {
    public static void main(String[] args) {
        int[] inArray = {3,2,1,5,6,4};
        int K = 2;
        find(inArray, K);

        System.out.println("----------------");

        int[] inArray1 = {3,2,3,1,2,4,5,5,6};
        K = 4;
        find(inArray1, K);
    }

    private static void find(int[] inArray, int K) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        for(int number : inArray) {
            pQueue.add(number);
            if(pQueue.size() > K) {
                pQueue.poll();
            }
        }
        while (!pQueue.isEmpty()) {
            System.out.println(pQueue.poll());
        }

    }
}

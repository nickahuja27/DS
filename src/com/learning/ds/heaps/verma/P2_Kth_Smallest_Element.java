package com.learning.ds.heaps.verma;

import java.util.PriorityQueue;

public class P2_Kth_Smallest_Element {
    public static void main(String[] args) {
        int[] inArray = {7, 10, 4, 3, 20, 15};
        findKthElement(inArray, 3);
    }

    private static void findKthElement(int[] inArray, int K) {
        // The question is asking for Smallest kth element, so we need to create Max Heap.
        // In MAx heap, the top element will always be the largest.
        // LOOK AT THE LAMBDA IN THE QUEUE DEF.
        PriorityQueue<Integer> pQueue = new PriorityQueue<>((i1, i2) -> i2 - i1);
        for(int num : inArray) {
            pQueue.add(num);
            if(pQueue.size() > K) {
                pQueue.remove();
            }
        }
        System.out.println("Smallest Kth Element is: " + pQueue.remove());
    }
}

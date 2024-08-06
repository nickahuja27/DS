package com.learning.ds.patterns.topKelements;

import java.awt.event.WindowAdapter;
import java.util.PriorityQueue;

public class LC703_Kth_LargestElementInAStream {
    private static PriorityQueue<Integer> pQueue = new PriorityQueue<>((i1,i2) -> i1 - i2);
    private static int K = 3;
    public static void main(String[] args) {
        int[] inArray = {4, 5, 8, 2};
        KthLargest(inArray);
        add(3);   // return 4
        add(5);   // return 5
        add(10);  // return 5
        add(9);   // return 8
        add(4);   // return 8
    }

    private static void KthLargest(int[] inArray) {
        for(int num : inArray) {
            pQueue.add(num);
            if(pQueue.size() > K) {
                pQueue.poll();
            }
        }
        System.out.println(pQueue.peek());
    }

    private static void add(int num) {
        pQueue.add(num);
        if(pQueue.size() > K) {
            pQueue.poll();
        }
        System.out.println(pQueue.peek());
    }
}

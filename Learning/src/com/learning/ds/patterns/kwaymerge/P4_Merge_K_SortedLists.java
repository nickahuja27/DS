package com.learning.ds.patterns.kwaymerge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class P4_Merge_K_SortedLists {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(2,6,19));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(1,24,35,97));
        List<Integer> l3 = new ArrayList<>(Arrays.asList(3,7));
        List<List<Integer>> containerList = new ArrayList<>(Arrays.asList(l1, l2, l3));
        merge(containerList);
    }

    private static void merge(List<List<Integer>> containerList) {
        List<Integer> resultList = new ArrayList<>();
        PriorityQueue<Pair> pQueue = new PriorityQueue<>((p1,p2) -> p1.number - p2.number);
        for(List<Integer> list : containerList) {
            pQueue.add(new Pair(list.remove(0), list));
        }
        while (!pQueue.isEmpty()) {
            Pair workingPair = pQueue.poll();
            List<Integer> fromList = workingPair.fromList;
            resultList.add(workingPair.number);
            if(fromList.size() > 0) {
                pQueue.add(new Pair(fromList.remove(0), fromList));
            }
        }

        System.out.println("Sorted List: " + resultList);
    }

    private static class Pair{
        public int number;
        public List<Integer> fromList;
        public Pair(int number, List<Integer> fromList) {
            this.number = number;
            this.fromList = fromList;
        }
    }
}

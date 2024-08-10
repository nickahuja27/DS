package com.learning.ds.patterns.kwaymerge;

import com.sun.source.tree.WhileLoopTree;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class P2_Kth_SmallestNumberIn_M_SortedLists {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(2,6,8));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(3,6,10));
        List<Integer> l3 = new ArrayList<>(Arrays.asList(5,8,11));
        List<List<Integer>> containerList = new ArrayList<>(Arrays.asList(l1, l2,l3));
        int kthElement = 5;
        find(containerList, kthElement);
    }

    private static void find(List<List<Integer>> containerList, int K) {
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

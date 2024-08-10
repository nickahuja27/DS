package com.learning.ds.patterns.mergeintervals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P1_MergeIntervals {
    public static void main(String[] args) {
        List<Interval> list = new ArrayList<>();
        list.add(new Interval(1,3));
        list.add(new Interval(2,6));
        list.add(new Interval(8,10));
        list.add(new Interval(15, 18));
        list.add(new Interval(18,20));
        merge(list);
    }

    private static void merge(List<Interval> intervalsList) {

    }

    private static boolean isOverlap(Interval i1, Interval i2) {
        if(i2.start >= i1.start && i2.start <= i1.end) return true;
        return false;
    }
}

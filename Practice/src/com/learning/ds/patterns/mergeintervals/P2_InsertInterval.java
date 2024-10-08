package com.learning.ds.patterns.mergeintervals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class P2_InsertInterval {
    public static void main(String[] args) {
        List<Interval> list = new ArrayList<>();
        list.add(new Interval(2, 4));
        list.add(new Interval(8, 12));
        list.add(new Interval(16, 20));

        merge(list, new Interval(0, 1));
    }

    private static void merge(List<Interval> intervalsList, Interval insertInterval) {

    }

    private static boolean isOverlap(Interval i1, Interval i2) {
        if ((i2.start < i1.start && i2.end > i1.start) ||
                (i1.start < i2.start && i1.end > i2.start))
            return true;
        return false;
    }

    private static boolean isBefore(Interval i1, Interval i2) {
        if (i1.end < i2.start)
            return true;
        return false;
    }

    private static boolean isAfter(Interval i1, Interval i2) {
        if (i1.start > i2.end)
            return true;
        return false;
    }
}

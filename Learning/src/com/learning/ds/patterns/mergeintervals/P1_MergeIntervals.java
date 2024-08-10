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
        // Sort the intervals on the startTime to ensure a.start <= b.start
        Stack<Interval> stack = new Stack<>();
        for(int i = 0; i < intervalsList.size(); i++) {
            Interval tempInterval = intervalsList.get(i);
            if(!stack.isEmpty()) {
                Interval poppedInterval = stack.pop();
                if(isOverlap(poppedInterval, tempInterval)) {
                    stack.push(new Interval(poppedInterval.start, tempInterval.end));
                } else {
                    stack.push(poppedInterval);
                    stack.push(tempInterval);
                }
            } else {
                stack.push(tempInterval);
            }
        }

        System.out.println(stack);
    }

    private static boolean isOverlap(Interval i1, Interval i2) {
        if(i2.start >= i1.start && i2.start <= i1.end) return true;
        return false;
    }
}

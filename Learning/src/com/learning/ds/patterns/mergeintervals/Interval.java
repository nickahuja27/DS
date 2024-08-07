package com.learning.ds.patterns.mergeintervals;

public class Interval {
    public int start;
    public int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("[").append(start).append(", ").append(end).append("]");
        return builder.toString();
    }
}

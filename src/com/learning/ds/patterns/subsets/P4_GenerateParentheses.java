package com.learning.ds.patterns.subsets;

import java.util.Optional;

public class P4_GenerateParentheses {
    private static char OPEN = '(';
    private static char CLOSED = ')';

    public static void main(String[] args) {
        int num = 3;
        generate(num, 0, 0, "");
    }

    private static void generate(int num, int openCounter, int closedCounter, String outString) {
        if(openCounter > num || closedCounter > num) return;

        if(openCounter == num && closedCounter == num) {
            System.out.println(outString);
            return;
        }
        // Choice, fill a place with OPEN or CLOSED bracket. Hence recursion
        generate(num, openCounter + 1, closedCounter, outString + OPEN);
        if(closedCounter < openCounter)
            generate(num, openCounter, closedCounter + 1, outString + CLOSED);

    }
}

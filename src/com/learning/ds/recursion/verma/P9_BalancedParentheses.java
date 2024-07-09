package com.learning.ds.recursion.verma;

public class P9_BalancedParentheses {
    public static void main(String[] args) {
        permutate(3, 3, "");
    }

    private static void permutate(int openCounter, int closedCounter, String outSoFar) {
        if (openCounter == 0 && closedCounter == 0) {
            System.out.println(outSoFar);
        }
        if(openCounter < 0 || closedCounter < 0) {
            return;
        }
        
        permutate(openCounter - 1, closedCounter, outSoFar + "(");
        if(openCounter < closedCounter) {
            permutate(openCounter, closedCounter - 1, outSoFar + ")");
        }
    }
}

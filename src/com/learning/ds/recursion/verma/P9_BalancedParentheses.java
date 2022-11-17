package com.learning.ds.recursion.verma;

public class P9_BalancedParentheses {
    public static void main(String[] args) {
        printParentheses(3, 3,"");
    }

    public static void printParentheses(int leftNum, int rightNum, String resultSoFar) {
        if (leftNum < 0 || rightNum < 0) {
            return;
        }

        if (leftNum == 0 && rightNum == 0) {
            System.out.println(resultSoFar);
            return;
        }

        printParentheses(leftNum - 1, rightNum, resultSoFar + "(");
        if(rightNum > leftNum)
            printParentheses(leftNum, rightNum - 1, resultSoFar + ")");
    }
}

package com.learning.ds.recursion.verma;

public class Factorial {
    public static void main(String a[]) {
        int factNum = printFactorial(5);
        System.out.println("Ans: " + factNum);
    }

    private static int printFactorial(int num) {
        if(num == 0) {
            return 1;
        }
        return num * printFactorial(num - 1);
    }
}
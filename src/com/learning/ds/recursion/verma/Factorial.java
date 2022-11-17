package com.learning.ds.recursion.verma;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(6));
    }

    public static int factorial(int num) {
        if(num <= 1)
            return num;

        return factorial(num - 1) + factorial(num - 2);
    }
}

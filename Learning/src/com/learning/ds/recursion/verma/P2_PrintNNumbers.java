package com.learning.ds.recursion.verma;

public class P2_PrintNNumbers {
    public static void main(String[] args) {
        print(10);
    }

    private static void print(int num) {
        if(num == 0)
            return;

        print(num - 1);
        System.out.print(" " + num);
    }
}

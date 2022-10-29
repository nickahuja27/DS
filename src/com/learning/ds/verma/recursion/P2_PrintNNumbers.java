package com.learning.ds.verma.recursion;

public class P2_PrintNNumbers {
    public static void main(String[] args) {
        print(10);
    }

    public static void print(int num) {
        if(num == 0) {
            return;
        }

        print(num - 1);
        System.out.println(num);
    }
}

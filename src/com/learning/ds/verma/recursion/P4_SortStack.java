package com.learning.ds.verma.recursion;

import java.util.Stack;

public class P4_SortStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);
        stack.push(9);
        stack.push(5);
        stack.push(6);
        stack.push(8);
        stack.push(7);

        sort(stack);
        System.out.println(stack);
    }

    public static void sort(Stack<Integer> stack) {
        if(stack.isEmpty())
            return;

        int poppedNum = stack.pop();
        sort(stack);
        insert(stack, poppedNum);
    }

    public static void insert(Stack<Integer> stack, int numToInsert) {
        if(stack.isEmpty() || stack.peek() <= numToInsert) {
            stack.push(numToInsert);
            return;
        }

        int poppedNum = stack.pop();
        insert(stack, numToInsert);
        stack.push(poppedNum);
    }
}

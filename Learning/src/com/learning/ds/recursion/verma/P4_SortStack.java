package com.learning.ds.recursion.verma;

import java.util.Stack;

public class P4_SortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
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

    private static void sort(Stack<Integer> inStack) {
        if(inStack.isEmpty())
            return;
        
        int number = inStack.pop();
        sort(inStack);
        place(inStack, number);
    }

    private static void place(Stack<Integer> inStack, int number) {
        if(inStack.isEmpty() || (inStack.peek() <= number)) {
            inStack.add(number);
            return;
        }
        int poppedNum = inStack.pop();
        place(inStack, number);
        inStack.add(poppedNum);
    }
}

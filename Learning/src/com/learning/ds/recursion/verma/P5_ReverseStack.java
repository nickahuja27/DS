package com.learning.ds.recursion.verma;

import java.util.Stack;

public class P5_ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack);
        reverse(stack);
        System.out.println(stack);
    }

    public static void reverse(Stack<Integer> inStack) {
        if(inStack.isEmpty())
            return;
        
        int num = inStack.pop();
        reverse(inStack);
        place(inStack, num);    

    }

    public static void place(Stack<Integer> inStack, int num) {
        if(inStack.isEmpty()) {
            inStack.add(num);
            return;
        }
        int poppedNum = inStack.pop();
        place(inStack, num);
        inStack.add(poppedNum);
    }
}

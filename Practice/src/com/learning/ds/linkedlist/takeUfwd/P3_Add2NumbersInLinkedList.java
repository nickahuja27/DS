package com.learning.ds.linkedlist.takeUfwd;

import com.learning.ds.Node;

public class P3_Add2NumbersInLinkedList {
    public static void main(String[] args) {
        // NUmbers are 987 and 456
        Node n1 = new Node(7);
        n1.next = new Node(8);
        n1.next.next = new Node(9);

        Node n2 = new Node(6);
        n2.next = new Node(5);
        n2.next.next = new Node(4);

        addNumbers(n1, n2);
    }

    private static void addNumbers(Node num1, Node num2) {

    }
}

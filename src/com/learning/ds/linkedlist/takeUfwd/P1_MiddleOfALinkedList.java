package com.learning.ds.linkedlist.takeUfwd;

import com.learning.ds.Node;

public class P1_MiddleOfALinkedList {
    public static void main(String[] args) {
        Node head = Node.createList();
        head.print();
        findMiddle(head);
    }

    private static void findMiddle(Node node) {
       Node slowPtr = node;
       Node fastPtr = node;

       while (fastPtr != null && fastPtr.next != null) {
           slowPtr = slowPtr.next;
           fastPtr = fastPtr.next.next;
       }
        System.out.println(slowPtr);
    }
}

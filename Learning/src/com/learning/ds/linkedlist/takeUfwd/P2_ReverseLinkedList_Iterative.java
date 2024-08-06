package com.learning.ds.linkedlist.takeUfwd;

import com.learning.ds.Node;

public class P2_ReverseLinkedList_Iterative {
    public static void main(String[] args) {
        Node head = Node.createList();
        reverse(head);
    }

    private static void reverse(Node node) {
        Node previous = null;
        Node current = node;

        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        previous.print();
    }
}

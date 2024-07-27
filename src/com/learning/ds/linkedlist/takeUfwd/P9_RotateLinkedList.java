package com.learning.ds.linkedlist.takeUfwd;

import com.learning.ds.Node;

public class P9_RotateLinkedList {
    public static void main(String[] args) {
        Node head = Node.createList();
        rotate(head, 3);
    }

    private static void rotate(Node origNode, int K) {
        Node slowPtr = origNode;
        Node fastPtr = origNode;

        for(int i = 0; i < K; i++)
            fastPtr = fastPtr.next;

        while (fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next;
        }

        fastPtr.next = origNode;
        origNode = slowPtr.next;
        slowPtr.next = null;

        origNode.print();
    }
}

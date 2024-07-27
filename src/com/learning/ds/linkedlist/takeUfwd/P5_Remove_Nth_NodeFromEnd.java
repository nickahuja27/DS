package com.learning.ds.linkedlist.takeUfwd;

import com.learning.ds.Node;

public class P5_Remove_Nth_NodeFromEnd {
    public static void main(String[] args) {
        Node head = Node.createList();
        remove(head, 2);
    }

    private static void remove(Node origNode, int K) {
        Node slowPtr = origNode;
        Node fastPtr = origNode;
        Node prevNode = null;

        for(int i = 0; i < K; i++) {
            fastPtr = fastPtr.next;
        }

        while (fastPtr.next != null) {
            prevNode = slowPtr;
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next;
        }
        prevNode.next = slowPtr.next;
        origNode.print();
    }
}

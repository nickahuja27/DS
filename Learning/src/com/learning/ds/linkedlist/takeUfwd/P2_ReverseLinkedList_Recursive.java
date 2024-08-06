package com.learning.ds.linkedlist.takeUfwd;

import com.learning.ds.Node;

public class P2_ReverseLinkedList_Recursive {
    public static void main(String[] args) {
        Node head = Node.createList();
        head = reverse(head);
        head.print();
    }

    private static Node reverse(Node node) {
        if(node.next == null)
            return node;
        Node newHead = reverse(node.next);
        Node tempNode = node.next;
        tempNode.next = node;
        node.next = null;
        return newHead;
    }
}

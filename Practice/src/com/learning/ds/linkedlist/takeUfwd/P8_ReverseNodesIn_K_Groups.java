package com.learning.ds.linkedlist.takeUfwd;

import com.learning.ds.Node;

public class P8_ReverseNodesIn_K_Groups {
    public static void main(String[] args) {
        Node head = Node.createList();
        Node reversed = reverseInGroups(head, 3);
        reversed.print();
    }

    public static Node reverseInGroups(Node origNode, int K) {
        return null;
    }

    private static Node reverse(Node node) {
        Node previous = null;
        Node current = node;

        while (current != null) {
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}

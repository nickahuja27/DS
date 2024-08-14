package com.learning.ds.linkedlist.takeUfwd;

import com.learning.ds.Node;

import javax.swing.plaf.IconUIResource;

public class P8_ReverseNodesIn_K_Groups {
    public static void main(String[] args) {
        Node head = Node.createList();
        Node reversed = reverseInGroups(head, 3);
        reversed.print();
    }

    public static Node reverseInGroups(Node origNode, int K) {
        Node tempNode = origNode;
        Node nextGroupNode = tempNode;
        Node groupStartPtr = origNode;
        Node prevGroupEndPtr = origNode;

        while (tempNode != null) {
            for(int i = 0; i < K; i++) {
                tempNode = tempNode.next;
            }
            nextGroupNode = tempNode.next;
            tempNode.next = null;
            Node reversedGroup = reverse(groupStartPtr);
            if(origNode == groupStartPtr) {
                origNode = reversedGroup;
            } else {
                prevGroupEndPtr.next = reversedGroup;
            }
            groupStartPtr = nextGroupNode;
        }
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

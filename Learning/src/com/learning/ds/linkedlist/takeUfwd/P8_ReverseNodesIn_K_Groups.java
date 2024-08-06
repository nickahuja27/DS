package com.learning.ds.linkedlist.takeUfwd;

import com.learning.ds.Node;

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
            for (int i = 0; i < K - 1; i++) {
                tempNode = tempNode.next;
                if(tempNode == null) {
                    prevGroupEndPtr.next = groupStartPtr;
                    return origNode;
                }
            }
            nextGroupNode = tempNode.next;
            tempNode.next = null;
            Node reversedGroup = reverse(groupStartPtr);
            if(origNode == groupStartPtr) {
                origNode = reversedGroup;
            } else {
                prevGroupEndPtr.next = reversedGroup;
            }
            prevGroupEndPtr = groupStartPtr;
            tempNode = nextGroupNode;
            groupStartPtr = nextGroupNode;
        }
        //System.out.println(nextGroupNode);
        return origNode;
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

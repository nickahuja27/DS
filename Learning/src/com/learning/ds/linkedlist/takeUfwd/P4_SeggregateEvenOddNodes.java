package com.learning.ds.linkedlist.takeUfwd;

import com.learning.ds.Node;

import javax.swing.*;

public class P4_SeggregateEvenOddNodes {
    public static void main(String[] args) {
        Node head = Node.createList();
        segregate(head);
    }

    private static void segregate(Node node) {
        Node evenNode = null;
        Node oddNode = null;
        Node evenHead = null;
        Node oddHead = null;
        while (node != null) {
            if(node.value % 2 == 0) {
                if(evenNode == null) {
                    evenNode = new Node(node.value);
                    evenHead = evenNode;
                } else {
                    evenNode.next = new Node(node.value);
                    evenNode = evenNode.next;
                }
            } else {
                if(oddNode == null) {
                    oddNode = new Node(node.value);
                    oddHead = oddNode;
                } else {
                    oddNode.next = new Node(node.value);
                    oddNode = oddNode.next;
                }
            }
            node = node.next;
        }
        evenNode.next = oddHead;
        evenHead.print();
    }
}

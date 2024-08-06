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
        int carryOver = 0;
        Node answerNode = null;
        Node head = null;
        while (num1 != null || num2 != null || carryOver > 0) {
            int sum = 0;

            if (num1 != null) {
                sum += num1.value;
                num1 = num1.next;
            }

            if(num2 != null) {
                sum += num2.value;
                num2 = num2.next;
            }

            sum += carryOver;
            int numToAdd = sum % 10;
            carryOver = sum / 10;
            if(answerNode == null) {
                answerNode = new Node(numToAdd);
                head = answerNode;
            } else {
                answerNode.next = new Node(numToAdd);
                answerNode = answerNode.next;
            }
        }
        head.print();
    }
}

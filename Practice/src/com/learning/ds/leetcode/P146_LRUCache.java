package com.learning.ds.leetcode;

import java.util.HashMap;

public class P146_LRUCache {
    private int capacity = 0;
    private Node head = null;
    private Node tail = null;
    private HashMap<Integer, Node> keyNodeMap = new HashMap<>();

    public static void main(String[] args) {
        P146_LRUCache lruCache = new P146_LRUCache(4);
        lruCache.put(2,6);
        lruCache.put(4,7);
        lruCache.put(8,11);
        lruCache.put(7,10);
        lruCache.get(2);
        lruCache.get(3);
        lruCache.put(5,6);
        lruCache.get(7);
        lruCache.put(5,7);
    }

    public P146_LRUCache(int capacity) {
        this.capacity = capacity;
        tail = new Node(-1, -1);
        head = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
    }

    private int get(int key) {
        if(keyNodeMap.get(key) != null) {
            Node node = keyNodeMap.get(key);
            deleteNode(node);
            insertAtFirst(node);
            return node.value;
        }
        return -1;
    }

    private void put(int key, int value) {
        Node nodeToAdd = null;
        if(keyNodeMap.get(key) != null) {
            nodeToAdd = keyNodeMap.get(key);
            deleteNode(nodeToAdd);
        } else {
            nodeToAdd = new Node(key, value);
        }
        if (keyNodeMap.size() == capacity) {
            deleteNode(tail.prev);
        }
        insertAtFirst(nodeToAdd);
    }

    private void insertAtFirst(Node node) {
        keyNodeMap.put(node.key, node);
        node.next = head.next;
        node.next.prev = node;
        node.prev = head;
        head.next = node;
    }

    private void deleteNode(Node node) {
        keyNodeMap.remove(node.key);
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    class Node {
        Node prev;
        Node next;
        int key;
        int value;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
}

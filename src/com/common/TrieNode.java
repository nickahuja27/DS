package com.common;

import java.util.HashMap;
import java.util.Map;

public class TrieNode {
    public Map<Character, TrieNode> charToNodeMap = new HashMap<>();
    public boolean isLeaf;

    public static void insert(TrieNode root, String key) {
        TrieNode tempNode = root;
        for (int i = 0; i < key.length(); i++) {
            tempNode.charToNodeMap.putIfAbsent(key.charAt(i), new TrieNode());
            tempNode = tempNode.charToNodeMap.get(key.charAt(i));
        }
        tempNode.isLeaf = true;
    }
}

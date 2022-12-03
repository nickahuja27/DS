package com.learning.ds.trie.techiedelight;

import com.common.TrieNode;

import java.util.ArrayList;
import java.util.List;

// https://www.techiedelight.com/word-break-problem-using-trie/
public class WordBreakProblem {
    public static void main(String[] args) {
        String dictOfWords[] = {"this", "th", "is", "famous", "Word", "break", "b", "r", "e", "a", "k", "br", "bre", "brea", "ak", "problem" };
        String inWord = "Wordbreakproblem";
        TrieNode root = new TrieNode();
        for (int i = 0; i < dictOfWords.length; i++) {
            TrieNode.insert(root, dictOfWords[i]);
        }

        breakWords(root, inWord);
    }

    private static void breakWords(TrieNode root, String inWord) {
        TrieNode tempNode = root;
        List<String> outList = new ArrayList<>();
        String strSoFar = "";
        for(int i = 0; i < inWord.length(); i++) {
            if(tempNode.charToNodeMap.get(inWord.charAt(i)) != null) {
                tempNode = tempNode.charToNodeMap.get(inWord.charAt(i));
                strSoFar += inWord.charAt(i);
                if(tempNode.isLeaf) {
                    strSoFar += " ";
                }
            }
        }

        System.out.println(strSoFar);
    }
}

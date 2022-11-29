package com.template.ds.graph.takeUfwd;

import java.util.LinkedList;
import java.util.Queue;

/**
 * We have to find the shortest number of transformations, so use BFS
 *
 */
public class P29_WordLadder_1 {
  private static String startWord = "hit";
  private static String targetWord = "cog";
  private static String[] wordList = {"hot", "dot", "dog", "lot", "log", "cog"};
  private static boolean visited[] = new boolean[wordList.length];

  public static void main(String[] args) {
    findShortestLength();
  }

  private static void findShortestLength() {

  }

  private static int searchWord(String word) {
    int index = -1;
    for(int i = 0; i < wordList.length; i++) {
      if(word.equals(wordList[i])) {
        index = i;
      }
    }

    return index;
  }

  public static class Pair{
    public String word;
    public int transformationLength;

    public Pair(String word, int transformationLength) {
      this.word = word;
      this.transformationLength = transformationLength;
    }

    public String toString() {
      return word + " : " + transformationLength;
    }
  }
}

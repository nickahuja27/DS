package com.learning.ds.graph.takeUfwd;

import java.util.Arrays;
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
    Queue<Pair> queue = new LinkedList<>();
    queue.add(new Pair("hit", 1));

    while (!queue.isEmpty()) {
      Pair tempPair = queue.poll();

      for(int i = 0; i < tempPair.word.length(); i++) {
        char[] tempWordArray = tempPair.word.toCharArray();
        for(char c = 'a'; c <='z'; c++) {
          tempWordArray[i] = c;
          String modifiedWordStr = new String(tempWordArray);
          int indexOfWord = searchWord(modifiedWordStr);
          if(indexOfWord >= 0) {
            if(modifiedWordStr.equals(targetWord)) {
              System.out.println("Word Found, Number of transformations: " + (tempPair.transformationLength + 1));
              return;
            }
            if (!visited[indexOfWord]) {
              System.out.println(modifiedWordStr + " : " + (tempPair.transformationLength + 1));
              queue.add(new Pair(modifiedWordStr, tempPair.transformationLength + 1));
              visited[indexOfWord] = true;
            }
          }
        }
      }
    }
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

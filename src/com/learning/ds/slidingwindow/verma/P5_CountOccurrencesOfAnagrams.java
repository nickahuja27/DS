package com.learning.ds.slidingwindow.verma;

import java.util.HashMap;

public class P5_CountOccurrencesOfAnagrams {
  public static void main(String[] args) {
    String text = "forxxxorfxdofr";
    String pattern = "for";
    countAnagrams(text, pattern);
  }

  private static void countAnagrams(String text, String pattern) {
    int start = 0;
    int end = 0;
    int anagramCounter = 0;

    HashMap<Character, Integer> charCountMap = new HashMap<>();
    for(int i = 0; i < pattern.length(); i++) {
      charCountMap.putIfAbsent(pattern.charAt(i), 0);
      int currNum = charCountMap.get(pattern.charAt(i));
      charCountMap.put(pattern.charAt(i), currNum + 1);
    }

    int counter = charCountMap.size();

    //"forxxxorfxdofr"
    while (end < text.length()) {
      //Do the calculations. This is done using the j/end or forward pointer.
      int tempCount = charCountMap.getOrDefault(text.charAt(end), -1);
      if(tempCount != -1) {
        if(tempCount > 0) {
          tempCount--;
          charCountMap.put(text.charAt(end), tempCount);
        }
        if(tempCount == 0) {
          counter--;
        }
      }

      if(end - start + 1 < pattern.length()) {
        end++;
      } else if(end - start + 1 == pattern.length()) {
        // Find the answer here.
        if(counter == 0) {
          System.out.println("Anagram Found");
          anagramCounter++;
        }

        //Remove the values corresponding the i or start pointer
        int removedCharCount = charCountMap.getOrDefault(text.charAt(start), -1);
        if(removedCharCount != -1) {
          if(removedCharCount == 0) {
            counter++;
          }
          charCountMap.put(text.charAt(start), removedCharCount + 1);
        }

        start++;
        end++;
      }
    }

    System.out.println("Total number of Anagrams: " + anagramCounter);
  }
}

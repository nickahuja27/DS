package com.learning.ds.slidingwindow.verma;

import java.util.HashMap;

public class P11_VariableSize_LongestSubstringWithNoRepeatingCharacters {
  public static void main(String[] args) {
    find("ABCABCDEABC");
  }

  private static void find(String inString) {
    int i = 0;
    int j = 0;
    HashMap<Character, Integer> charCounterMap = new HashMap<>();
    int maxLength = 0;

    while (j < inString.length()) {
      charCounterMap.putIfAbsent(inString.charAt(j), 0);
      int currValue = charCounterMap.get(inString.charAt(j));
      charCounterMap.put(inString.charAt(j), currValue + 1);

      if(charCounterMap.size() > (j - i + 1)) {
        // this condition will never come
        j++;
      } else if(charCounterMap.size() == (j - i + 1)) {
        System.out.println("Length here is: " + (j - i + 1));
        System.out.println("Substring is:" + inString.substring(i, j + 1) + "\n");
        maxLength = Math.max(maxLength, (j - i + 1));
        j++;
      } else {
        while(charCounterMap.size() < (j - i + 1)) {
          int beginCounter = charCounterMap.get(inString.charAt(i));
          beginCounter--;
          if (beginCounter == 0) {
            charCounterMap.remove(inString.charAt(i));
          } else {
            charCounterMap.put(inString.charAt(i), beginCounter);
          }
          i++;
        }
        j++;
      }
    }

    System.out.println("Max length is: " + maxLength);
  }
}

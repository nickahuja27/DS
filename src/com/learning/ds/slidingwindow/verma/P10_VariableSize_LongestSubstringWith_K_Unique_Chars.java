package com.learning.ds.slidingwindow.verma;

import java.util.HashMap;

public class P10_VariableSize_LongestSubstringWith_K_Unique_Chars {
  public static void main(String[] args) {
    String inString = "aabacbebebe";
    int uniqueChars = 3;
    find(inString, uniqueChars);
  }

  private static void find(String inString, int uniqueChars) {
    int i = 0;
    int j = 0;
    HashMap<Character, Integer> charCounterMap = new HashMap<>();
    int maxLength = 0;

    while (j < inString.length()) {
      charCounterMap.putIfAbsent(inString.charAt(j), 0);
      int currValue = charCounterMap.get(inString.charAt(j));
      charCounterMap.put(inString.charAt(j), currValue + 1);

      if(charCounterMap.size() < uniqueChars) {
        j++;
      } else if(charCounterMap.size() == uniqueChars) {
        System.out.println("Length here is: " + (j - i + 1));
        maxLength = Math.max(maxLength, (j - i + 1));
        j++;
      } else {
        while (charCounterMap.size() > uniqueChars) {
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

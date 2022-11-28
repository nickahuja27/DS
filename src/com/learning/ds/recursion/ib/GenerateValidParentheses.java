package com.learning.ds.recursion.ib;

import java.util.ArrayList;

public class GenerateValidParentheses {
  public static void main(String[] args) {
    generate(3, 0, 0, new StringBuilder());
  }

  private static void generate(int length, int openLength, int closedLength, StringBuilder resultsSoFar) {
    if(openLength == length && closedLength == length) {
      System.out.println(resultsSoFar.toString());
      return;
    }

    if(openLength < length) {
      resultsSoFar.append("(");
      generate(length, openLength + 1, closedLength, resultsSoFar);
      resultsSoFar.deleteCharAt(resultsSoFar.length() - 1);
    }
    if(closedLength < length && openLength > closedLength) {
      resultsSoFar.append(")");
      generate(length, openLength, closedLength + 1, resultsSoFar);
      resultsSoFar.deleteCharAt(resultsSoFar.length() - 1);
    }
  }
}

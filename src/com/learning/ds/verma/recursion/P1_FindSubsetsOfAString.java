package com.learning.ds.verma.recursion;

public class P1_FindSubsetsOfAString {
    public static void main(String[] args) {
        findSubsets("abc", "");
    }

    private static void findSubsets(String inString, String outSoFar) {
        if (inString == null || inString.length() == 0) {
            System.out.println("subset: {" + outSoFar + "}");
            return;
        }

        findSubsets(inString.substring(1), outSoFar + inString.charAt(0));
        findSubsets(inString.substring(1), outSoFar);
    }
}

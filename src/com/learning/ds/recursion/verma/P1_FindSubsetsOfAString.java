package com.learning.ds.recursion.verma;

public class P1_FindSubsetsOfAString {
    public static void main(String[] args) {
        printSubsets("abc", "");
    }

    private static void printSubsets(String inString, String outString) {
        if(inString.equals("")) {
            System.out.println("Subset: " + outString);
            return;
        }

        printSubsets(inString.substring(1), outString);
        printSubsets(inString.substring(1), outString + inString.charAt(0));
    }
}

package com.learning.ds.verma.recursion;

public class P8_PermutationWithCaseChange {
    public static void main(String[] args) {
        permutate("abc", "");
    }

    public static void permutate(String inString, String outSoFar) {
        if(inString.length() == 0) {
            System.out.println(outSoFar);
            return;
        }

        permutate(inString.substring(1), outSoFar + inString.charAt(0));
        permutate(inString.substring(1), outSoFar + Character.toUpperCase(inString.charAt(0)));
    }
}

package com.learning.ds.recursion.verma;

public class P8_PermutationWithCaseChange {
    public static void main(String[] args) {
        permutate("abc", "");
    }

    private static void permutate(String inString, String outSoFar) {
        if(inString.isEmpty()) {
            System.out.println(outSoFar);
            return;
        }

        permutate(inString.substring(1), outSoFar + inString.charAt(0));
        permutate(inString.substring(1), outSoFar + Character.toUpperCase(inString.charAt(0)));
    }
}

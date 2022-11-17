package com.learning.ds.recursion.verma;

public class P7_PermutationWithSpaces {
    public static void main(String[] args) {
        permutate("BC", "A");
    }

    public static void permutate(String inString, String outSoFar) {
        if(inString.length() == 0) {
            System.out.println(outSoFar);
            return;
        }

        permutate(inString.substring(1), outSoFar + "_" + inString.charAt(0));
        permutate(inString.substring(1), outSoFar + inString.charAt(0));
    }
}

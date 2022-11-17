package com.learning.ds.recursion.verma;

// Leetcode 779
public class P6_KthSymbolInGrammar {
    public static void main(String[] args) {
        print(3,3);
    }

    public static String print(int n, int k) {
        if(n == 1) {
            System.out.println("0");
            return "0";
        }

        String retString = print(n - 1, k);
        char[] retChars = retString.toCharArray();
        String workingStr = "";
        for(int i = 0; i < Math.min(retChars.length, k); i++) {
            if(retChars[i] == '0')
                workingStr += "01";
            if(retChars[i] == '1')
                workingStr += "10";
        }
        System.out.println(workingStr);
        return workingStr;
    }
}

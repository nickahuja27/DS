package com.learning.ds.recursion.verma;

/*
 * 
 * 0
 * 01
 * 0110
 * 01101001
 */
public class P6_KthSymbolInGrammar {
    public static void main(String[] args) {
        String retString = print(4, 3);
        System.out.println(retString);
    }

    private static String print(int n, int k) {
        if(n == 1) {
            return "0";
        }

        String retStr = print(n - 1, k);
        String workingStr = new String();
        for(int i = 0; i < retStr.length(); i++) {
            if(retStr.charAt(i) == '0')
                workingStr += "01";
            else
                workingStr += "10";
        }
        System.out.println("Debug: "+workingStr);
        return workingStr;
    }
}

package com.learning.ds.leetcode;

import java.util.ArrayList;

public class P006_ZigZagConversion {
    public static void main(String[] args) {
        String inString = "PAYPALISHIRING";
        int numOfLines = 3;
        zigZagConversion(inString, numOfLines);
    }

    private static void zigZagConversion(String inString, int numOfLines) {
        ArrayList<Character>[] linesArray = new ArrayList[numOfLines];
        for(int i = 0; i < numOfLines; i++) {
            linesArray[i] = new ArrayList<>();
        }
        boolean flag = true;
        int counter = 0;
        for(char c : inString.toCharArray()) {
            if(flag) {
                linesArray[counter++].add(c);
            } else {
                linesArray[--counter].add(c);
            }
            if(counter == 0 || counter == numOfLines)
                flag = !flag;

            if(counter == numOfLines)
                counter--;
            if(counter == 0)
                counter++;
        }

        for(int i = 0; i < numOfLines; i++) {
            System.out.println(linesArray[i]);
        }
    }
}

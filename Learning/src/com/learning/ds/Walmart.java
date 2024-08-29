package com.learning.ds;

import java.util.StringTokenizer;

public class Walmart {
    public static void main(String[] args) {
        // 1 4 2
        int numberOfSeconds = getNumOfSeconds("1 4 2");
        System.out.println(numberOfSeconds);
    }

    private static int getNumOfSeconds(String inString) {
        StringTokenizer tokenizer = new StringTokenizer(inString);
        int tokens = tokenizer.countTokens();
        int[] inCups = new int[tokens];
        int cupsCounter = 0;
        int numberOfCups = 0;
        while (tokenizer.hasMoreElements()) {
            inCups[cupsCounter] = Integer.parseInt((String)tokenizer.nextElement());
            numberOfCups += inCups[cupsCounter];
            cupsCounter++;
        }

        int counter = 0;
        int numberOfSeconds = 0;
        while (numberOfCups > 0) {
            for(int i = 0; i < inCups.length; i++) {
                if(inCups[i] > 0) {
                    inCups[i] = inCups[i] - 1;
                    numberOfCups--;
                    counter++;
                }
                if(counter == 2) {
                    counter = 0;
                    break;
                }
            }
            numberOfSeconds++;
        }

        return numberOfSeconds;
    }
}

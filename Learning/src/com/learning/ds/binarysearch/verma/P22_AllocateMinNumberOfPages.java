package com.learning.ds.binarysearch.verma;

import java.util.Arrays;

public class P22_AllocateMinNumberOfPages {
    public static void main(String[] args) {
        int[] pages = {10,20,30,40};
        int numOfStudents = 2;
        int sumOfAllPages = Arrays.stream(pages).sum();
        isValid(pages, 2, 50);
    }

    public static int findMinPages(int[] pages, int numOfStudents, int min, int max) {
        if(max > min)
            return -1;
        return 0;
    }

    public static boolean isValid(int[] pages, int numOfStudents, int maxAllowed) {
        int studentCounter = 1;
        int pagesSum = 0;
        for(int i = 0; i < pages.length; i++) {
            pagesSum += pages[i];
            if(pagesSum > maxAllowed) {
                studentCounter++;
                pagesSum = pages[i];
            }
            if(studentCounter > numOfStudents)
                return false;
        }
        return true;
    }
}

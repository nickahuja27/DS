package com.learning.ds.binarysearch.verma;

public class P5_FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] numArray = {1, 3, 3, 3, 3, 3, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 8, 9, 10, 12, 13, 15, 16};
        findNum(numArray, 3, 0, numArray.length - 1);
    }

    public static void findNum(int[] numArray, int numToFind, int start, int end) {
        if(end < start)
            return;
        int mid = (start + end) / 2;
        if(numArray[mid] == numToFind && numArray[mid] > numArray[mid - 1]) {
            System.out.println("First Occurrence index : " + mid);
        } else if(numArray[mid] == numToFind && numArray[mid] < numArray[mid + 1]) {
            System.out.println("Last Occurrence index : " + mid);
        }

        findNum(numArray, numToFind, start, mid - 1);
        findNum(numArray, numToFind, mid + 1, end);
    }
}

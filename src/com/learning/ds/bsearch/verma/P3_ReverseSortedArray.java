package com.learning.ds.bsearch.verma;

public class P3_ReverseSortedArray {
    public static void main(String[] args) {
        int[] numArray = {16,15,12,10,9,7,6,4,2,1};
        int numFound = findNum(numArray, 6, 0, numArray.length - 1);
        System.out.println("Num found: " + numFound);
    }

    public static int findNum(int[] numArray, int numToFind, int start, int end) {
        if(end < start)
            return -1;

        int mid = (start + end) / 2;
        if(numArray[mid] == numToFind) {
            return numArray[mid];
        }

        if(numArray[mid] < numToFind)
            return findNum(numArray, numToFind, start, mid - 1);

        else
            return findNum(numArray, numToFind, mid + 1, end);
    }
}

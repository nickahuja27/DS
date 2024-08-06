package com.learning.ds.binarysearch.verma;

public class P15_MinDiffElementInSortedArray {
    public static void main(String[] args) {
        int[] numArray = {1,3,6,7,8,9,10,12,13,15,16,20,25,30,31};
        int numFound = findNum(numArray, 21, 0, numArray.length - 1);
        System.out.println("Num found: " + numFound);
    }

    public static int findNum(int[] numArray, int key, int start, int end) {
        if(end < start)
            return -1;

        int mid = (start + end) / 2;
        if(numArray[mid] == key) {
            return 0;
        }

        if(numArray[mid] < key && numArray[mid + 1] > key) {
            return Math.min(key - numArray[mid], numArray[mid + 1] - key);
        }

        if(numArray[mid] > key)
            return findNum(numArray, key, start, mid - 1);

        else
            return findNum(numArray, key, mid + 1, end);
    }
}

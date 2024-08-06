package com.learning.ds.binarysearch.verma;

public class P7_NumOfTimesArrayIsRotated {
    public static void main(String[] args) {
        int[] numArray = {6,7,8,9,10,12,13,15,16,1,2,3};
        int indexFound = findIndex(numArray, 0, numArray.length - 1);
        System.out.println("Number of times rotated: " + indexFound);
    }

    public static int findIndex(int[] inArray, int start, int end) {
        if(end < start)
            return -1;

        int mid = (start + end) / 2;
        if(inArray[mid] > inArray[mid + 1]) {
            System.out.println("Index: " + mid);
            return inArray.length - mid - 1;
        }

        if(inArray[mid] > inArray[start])
            return findIndex(inArray, mid + 1, end);
        else
            return findIndex(inArray, start, mid - 1);
    }
}

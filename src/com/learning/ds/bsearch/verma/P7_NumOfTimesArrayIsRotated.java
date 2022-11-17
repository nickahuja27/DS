package com.learning.ds.bsearch.verma;

public class P7_NumOfTimesArrayIsRotated {
    public static void main(String[] args) {
        int[] numArray = {6,7,8,9,10,12,13,15,16,1,2,3};
        int indexFound = findIndex(numArray, 0, numArray.length - 1);
        System.out.println("Index: " + indexFound);
    }

    public static int findIndex(int[] numArray, int start, int end) {
        if(end < start)
            return -1;

        int mid = (start + end) / 2;
        if(numArray[mid] > numArray[mid + 1] && numArray[mid] > numArray[mid - 1]) {
            return mid;
        }

        if(numArray[mid] > numArray[start])
            return findIndex(numArray, mid + 1, end);
        else
            return findIndex(numArray, start, mid - 1);
    }
}

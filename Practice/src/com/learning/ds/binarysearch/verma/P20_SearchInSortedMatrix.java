package com.learning.ds.binarysearch.verma;

public class P20_SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] numArray = {
                            {1, 2, 3, 4, 5},
                            {6, 7, 8, 9, 10},
                            {11,12,13,14,15},
                            {16,17,18,19,20}};
        findNum(numArray, 13, 0, numArray.length * numArray[0].length - 1);
    }

    public static void findNum(int[][] numArray, int numToFind, int start, int end) {

    }
}

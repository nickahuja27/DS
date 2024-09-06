package com.learning.ds.blind75.arrays;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] inArray = {4,5,6,7,0,1,2};
        int numToFind = 0;
        findNumber(inArray, numToFind, 0, inArray.length - 1);
    }

    private static void findNumber(int[] inArray, int numToFind, int min, int max) {
        if(min > max) return;
        int mid = (min + max) / 2;
        if(inArray[mid] == numToFind) {
            System.out.println("Number found at Index: " + mid);
            return;
        }

        //Left side is sorted.
        if(inArray[min] < inArray[mid]) {
            if(inArray[min] <= numToFind && numToFind < inArray[mid]) {
                findNumber(inArray, numToFind, min, mid - 1);
            } else {
                findNumber(inArray, numToFind, mid + 1, max);
            }
        } else {
            //Right side is sorted.
            if(inArray[mid] < numToFind && numToFind <= inArray[max]) {
                findNumber(inArray, numToFind, mid + 1, max);
            } else {
                findNumber(inArray, numToFind, min,  mid - 1);
            }
        }
    }
}

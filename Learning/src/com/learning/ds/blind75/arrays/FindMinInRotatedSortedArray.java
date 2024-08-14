package com.learning.ds.blind75.arrays;

public class FindMinInRotatedSortedArray {
    public static void main(String[] args) {
        int[] inArray = {4,5,6,7,8,9,0,1,2,3};
        findSmallest(inArray, 0, inArray.length - 1);
    }

    private static void findSmallest(int[] inArray, int min, int max) {
        if(min > max) return;

        int mid = (min + max) / 2;
        if(inArray[mid] > inArray[mid + 1] && inArray[mid] > inArray[mid - 1]) {
            System.out.println("Smallest Number is: " + inArray[mid + 1]);
        }

        if(inArray[mid] > inArray[min]) {
            findSmallest(inArray, mid + 1, max);
        } else {
            findSmallest(inArray, min, mid - 1);
        }
    }
}

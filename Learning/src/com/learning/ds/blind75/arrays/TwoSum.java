package com.learning.ds.blind75.arrays;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {2,6,5,8,11};
        int target = 14;
        find(arr, target);
    }

    private static void find(int[] inArray, int target) {
        if(inArray.length == 0) return;
        int startPtr = 0;
        int endPtr = inArray.length - 1;
        while (startPtr < endPtr) {
            int workingSum = inArray[startPtr] + inArray[endPtr];
            if(workingSum == target) {
                System.out.println("Indexes are: " + startPtr + ", " + endPtr);
                break;
            }
            if(workingSum < target) startPtr++;
            if (workingSum < target) endPtr--;
        }
    }
}

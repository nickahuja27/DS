package com.learning.ds.patterns.twopointer;

//https://leetcode.com/problems/two-sum/description/
public class TwoSumSorted {
    public static void main(String[] args) {
        int[] inArray = {2, 3, 4, 5, 8, 11, 18};
        find(inArray, 8);
    }

    private static void find(int[] inArray, int target) {
        int left = 0;
        int right = inArray.length - 1;
        int workingSum = 0;

        while (left < right) {
            workingSum = inArray[left] + inArray[right];
            if(target > workingSum){
                left++;
            }  else if(target == workingSum) {
                System.out.println("Indices are Left: " + left + ", Right: " + right);
                break;
            } else if (target < workingSum) {
                right--;
            }
        }
    }
}

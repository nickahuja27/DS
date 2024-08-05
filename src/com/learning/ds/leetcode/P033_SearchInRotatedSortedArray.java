package com.learning.ds.leetcode;


// https://www.youtube.com/watch?v=5qGrJbHhqFs&t=2s
public class P033_SearchInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {7, 8, 9, 1, 2, 3, 4, 5, 6};
        int[] nums2 = {8, 9, 1, 2, 3, 4, 5, 6, 7};
        int index1 = search(nums, 1, 0, nums.length - 1);
        System.out.println("Index is: " + index1);

        int index2 = search(nums, 1, 0, nums.length - 1);
        System.out.println("Index is: " + index2);
    }

    private static int search(int[] inArray, int target, int low, int high) {
        if (low > high) return -1;

        int mid = (low + high) / 2;
        if (inArray[mid] == target) {
            return mid;
        }

        if(inArray[low] <= inArray[mid]) { //Left Half is sorted.
            if(target > inArray[low] && target < inArray[mid]) {
                return search(inArray, target, low, mid - 1);
            } else {
                return search(inArray, target, mid + 1, high);
            }
        } else { //Right half is sorted.
            if(target > inArray[mid] && target < inArray[high]) {
                return search(inArray, target, mid + 1, high);
            } else {
                return search(inArray, target, low, mid - 1);
            }
        }
    }
}

package com.learning.ds.blind75.arrays;

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] heights = {1,8,6,2,5,4,8,3,7};
        findContainer(heights);
    }

    private static void findContainer(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxContainer = Integer.MIN_VALUE;

        while (left < right) {
            int currContainer = Math.abs(left - right) * Math.min(heights[left], heights[right]);
            maxContainer = Math.max(maxContainer, currContainer);
            if(heights[left] <= heights[right])
                left++;
            else
                right--;
        }
        System.out.println("Max Container is: " + maxContainer);
    }
}

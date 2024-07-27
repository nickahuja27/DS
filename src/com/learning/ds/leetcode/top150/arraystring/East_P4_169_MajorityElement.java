package com.learning.ds.leetcode.top150.arraystring;

public class East_P4_169_MajorityElement {
    public static void main(String[] args) {
        int[] inArray = {7, 1, 5, 3, 6, 4};
        findMaxProfit(inArray);
    }

    private static void findMaxProfit(int[] inArray) {
        int minPrice = -1;
        int maxProfit = 0;
        minPrice = inArray[0];

        for (int price : inArray) {

            maxProfit = Math.max(maxProfit, price - minPrice);
            minPrice = Math.min(minPrice, price);
        }

        System.out.println("Max profit is: " + maxProfit);
    }
}

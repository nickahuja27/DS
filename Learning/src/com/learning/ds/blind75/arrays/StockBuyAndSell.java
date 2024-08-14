package com.learning.ds.blind75.arrays;

public class StockBuyAndSell {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int maxProfit = findMaxProfit(prices);
        System.out.println(maxProfit);
    }

    private static int findMaxProfit(int[] inArray) {
        int maxProfit = Integer.MIN_VALUE;
        int counter = 0;
        int minPrice = Integer.MAX_VALUE;

        while (counter < inArray.length) {
            minPrice = Math.min(minPrice, inArray[counter]);
            maxProfit = Math.max(maxProfit, inArray[counter] - minPrice);
            counter++;
        }
        return maxProfit;
    }
}

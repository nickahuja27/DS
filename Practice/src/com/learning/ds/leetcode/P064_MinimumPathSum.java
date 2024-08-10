package com.learning.ds.leetcode;

public class P064_MinimumPathSum {
    static int minSum = Integer.MAX_VALUE;
    public static void main(String[] args) {
        int[][] matrix = {
                {1,3,1},
                {1,5,1},
                {4,2,1}};

        int pathSum = minPathSum(matrix, 0, 0);
        System.out.println(pathSum);
    }

    private static int minPathSum(int[][] matrix, int row, int col) {
        return -1;
    }

    private static boolean isSafe(int[][] matrix, int row, int col) {
        return row >=0 && row < matrix.length &&
                col >= 0 && col < matrix[0].length;
    }
}

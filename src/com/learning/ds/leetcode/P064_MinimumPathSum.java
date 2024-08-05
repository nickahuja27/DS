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
        if(row == matrix.length - 1 && col == matrix[0].length - 1)
            return matrix[row][col];

        int rightSum = Integer.MAX_VALUE;
        int downSum = Integer.MAX_VALUE;

        if(isSafe(matrix, row, col + 1))
            rightSum = minPathSum(matrix, row, col + 1);
        if(isSafe(matrix, row + 1, col))
            downSum = minPathSum(matrix, row + 1, col);
        return matrix[row][col] + Math.min(rightSum, downSum);
    }

    private static boolean isSafe(int[][] matrix, int row, int col) {
        return row >=0 && row < matrix.length &&
                col >= 0 && col < matrix[0].length;
    }
}

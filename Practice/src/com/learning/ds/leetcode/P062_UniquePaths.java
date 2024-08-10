package com.learning.ds.leetcode;

public class P062_UniquePaths {
    public static void main(String[] args) {
        int[][] matrix = new int[3][7];
        matrix[0][0] = 1;
        matrix[2][6] = 2;
        int paths = uniquePaths(matrix, 0, 0);
        System.out.println(paths);
    }

    private static int uniquePaths(int[][] matrix, int row, int col) {
        return -1;
    }

    private static boolean isSafe(int[][] matrix, int row, int col) {
        return row >=0 && row < matrix.length &&
                col >= 0 && col < matrix[0].length;
    }
}

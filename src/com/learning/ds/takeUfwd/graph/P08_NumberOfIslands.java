package com.learning.ds.takeUfwd.graph;

public class P08_NumberOfIslands {
    private static int[][] matrix =
            {
                    {1, 0, 1, 0, 0, 0, 1, 1, 1, 1},
                    {0, 0, 1, 0, 1, 0, 1, 0, 0, 0},
                    {1, 1, 1, 1, 0, 0, 1, 0, 0, 0},
                    {1, 0, 0, 1, 0, 1, 0, 0, 0, 0},
                    {1, 1, 1, 1, 0, 0, 0, 1, 1, 1},
                    {0, 1, 0, 1, 0, 0, 1, 1, 1, 1},
                    {0, 0, 0, 0, 0, 1, 1, 1, 0, 0},
                    {0, 0, 0, 1, 0, 0, 1, 1, 1, 0},
                    {1, 0, 1, 0, 1, 0, 0, 1, 0, 0},
                    {1, 1, 1, 1, 0, 0, 0, 1, 1, 1}
            };

    private static boolean visited[][] = new boolean[matrix.length][matrix[0].length];

    public static void main(String[] args) {
        int numOfIslands = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1 && !visited[i][j]) {
                    dfs(i, j);
                    numOfIslands++;
                }
            }
        }

        System.out.println("Number of Islands: " + numOfIslands);
    }

    private static void dfs(int row, int col) {
        visited[row][col] = true;

        if (isSafe(row - 1, col - 1))
            dfs(row - 1, col - 1);
        if (isSafe(row - 1, col))
            dfs(row - 1, col);
        if (isSafe(row - 1, col + 1))
            dfs(row - 1, col + 1);
        if (isSafe(row, col - 1))
            dfs(row, col - 1);
        if (isSafe(row, col + 1))
            dfs(row, col + 1);
        if (isSafe(row + 1, col - 1))
            dfs(row + 1, col - 1);
        if (isSafe(row + 1, col))
            dfs(row + 1, col);
        if (isSafe(row + 1, col + 1))
            dfs(row + 1, col + 1);
    }

    private static boolean isSafe(int x, int y) {
        if (x >= 0 && x < matrix.length && y >= 0 && y < matrix.length && !visited[x][y] && matrix[x][y] == 1) {
            return true;
        }
        return false;
    }
}

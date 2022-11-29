package com.practice.ds.graph.takeUfwd;

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

    }

    private static void dfs(int row, int col) {

    }

    private static boolean isSafe(int x, int y) {
        if (x >= 0 && x < matrix.length && y >= 0 && y < matrix.length && !visited[x][y] && matrix[x][y] == 1) {
            return true;
        }
        return false;
    }
}

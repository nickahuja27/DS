package com.learning.ds.graphs.takeUfwd;

import java.util.Arrays;

public class P14_SurroundedRegions_Replace_O_with_Xs {
    private static char matrix[][] = {
            {'X', 'X', 'X', 'X'},
            {'X', 'O', 'X', 'X'},
            {'X', 'O', 'O', 'X'},
            {'X', 'O', 'X', 'X'},
            {'X', 'X', 'O', 'O'}};

    private static boolean visited[][] = new boolean[matrix.length][matrix[0].length];

    public static void main(String[] args) {
        solution();
        for (int i = 0; i < visited.length; i++) {
            System.out.println(Arrays.toString(visited[i]));
        }
    }

    private static void solution() {
    }

    private static void dfs(int row, int col){
        if(visited[row][col]) return;

        visited[row][col] = true;

        if (isSafe(row + 1, col))
            dfs(row + 1, col);
        if (isSafe(row - 1, col))
            dfs(row - 1, col);
        if (isSafe(row, col - 1))
            dfs(row, col - 1);
        if (isSafe(row, col + 1))
            dfs(row, col + 1);
    }

    private static boolean isSafe(int row, int col) {
        if(row < matrix.length && row >= 0 && col >= 0 && col < matrix[0].length &&
                !visited[row][col] && matrix[row][col] == 'O')
            return true;
        return false;
    }
}

package com.learning.ds.graph.takeUfwd;

import java.util.Arrays;

public class P14_SurroundedRegions {
    private static char matrix[][] = {
            {'X', 'X', 'X', 'X'},
            {'X', 'O', 'X', 'X'},
            {'X', 'O', 'O', 'X'},
            {'X', 'O', 'X', 'O'},
            {'X', 'X', 'O', 'O'}};

    private static boolean visited[][] = new boolean[matrix.length][matrix[0].length];

    public static void main(String[] args) {
        for(int i = 0; i < matrix[0].length; i++) {
            if(matrix[0][i] == 'O' && !visited[0][i]) {
                dfs(0, i);
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            if(matrix[i][matrix[0].length - 1] == 'O' && !visited[i][matrix[0].length - 1]) {
                dfs(i, matrix[0].length - 1);
            }
        }

        for(int i = 0; i < matrix[0].length; i++) {
            if(matrix[matrix.length - 1][i] == 'O' && !visited[matrix.length - 1][i]) {
                dfs(matrix.length - 1, i);
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            if(matrix[i][0] == 'O' && !visited[i][0]) {
                dfs(i, 0);
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                if(matrix[i][j] == 'O' && !visited[i][j]) {
                    dfs(i, j);
                }
            }
        }

        for(int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

        for(int i = 0; i < visited.length; i++) {
            System.out.println(Arrays.toString(visited[i]));
        }
    }

    private static void dfs(int row, int col) {
        visited[row][col] = true;


        if (isSafe(row - 1, col))
            dfs(row - 1, col);
        if (isSafe(row + 1, col))
            dfs(row + 1, col);
        if (isSafe(row, col - 1))
            dfs(row, col - 1);
        if (isSafe(row, col + 1))
            dfs(row, col + 1);


    }

    private static boolean isSafe(int x, int y) {
        if (x >= 0 && x < matrix.length && y >= 0 && y < matrix[x].length && !visited[x][y] && matrix[x][y] == 'O') {
            return true;
        }
        return false;
    }
}

package com.template.ds.graph.takeUfwd;

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

    }


    private static boolean isSafe(int x, int y) {
        if (x >= 0 && x < matrix.length && y >= 0 && y < matrix[x].length && !visited[x][y] && matrix[x][y] == 'O') {
            return true;
        }
        return false;
    }
}

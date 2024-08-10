package com.learning.ds.graphs.takeUfwd;

import com.learning.ds.GraphNode;

import java.util.LinkedList;
import java.util.Queue;

public class P10_RottenOranges {
    private static int[][] matrix = {{1,1,1},
            {1,1,0},
            {0,1,1}};

    private static boolean visited[][] = new boolean[matrix.length][matrix[0].length];

    public static void main(String[] args) {
        int minTime = bfs(0,0);
        System.out.println("Min time is: " + minTime);
    }
    
    private static int bfs(int row, int col) {


        return -1;
    }

    private static boolean isSafe(int x, int y) {
        if (x >= 0 && x < matrix.length && y >= 0 && y < matrix.length && !visited[x][y] && matrix[x][y] == 1) {
            return true;
        }
        return false;
    }

    public static class Pair {
        public Pair(int row, int col, int time) {
            this.row = row;
            this.col = col;
            this.time = time;
        }
        int row;
        int col;
        int time;
    }
}

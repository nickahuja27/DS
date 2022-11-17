package com.learning.ds.graph.takeUfwd;

import java.util.LinkedList;
import java.util.Queue;

public class P10_RottenOranges {
    private static int[][] matrix = {{2,1,1},
            {1,1,0},
            {0,1,1}};

    private static boolean visited[][] = new boolean[matrix.length][matrix[0].length];

    public static void main(String[] args) {
        int minTime = getTime(0,0);
        System.out.println("Min time is: " + minTime);
    }

    public static int getTime(int row, int col) {
        int minTime = 0;
        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(row, col, minTime));
        visited[row][col] = true;
        while (!queue.isEmpty()) {
            Pair tempPair = queue.poll();

            if(isSafe(tempPair.row, tempPair.col - 1)) {
                queue.add(new Pair(tempPair.row, tempPair.col - 1, tempPair.time + 1));
                visited[tempPair.row][tempPair.col-1] = true;
            }
            if(isSafe(tempPair.row, tempPair.col + 1)) {
                queue.add(new Pair(tempPair.row, tempPair.col + 1, tempPair.time + 1));
                visited[tempPair.row][tempPair.col+1] = true;
            }
            if(isSafe(tempPair.row - 1, tempPair.col)) {
                queue.add(new Pair(tempPair.row - 1, tempPair.col, tempPair.time + 1));
                visited[tempPair.row-1][tempPair.col] = true;
            }
            if(isSafe(tempPair.row + 1, tempPair.col)) {
                queue.add(new Pair(tempPair.row + 1, tempPair.col, tempPair.time + 1));
                visited[tempPair.row+1][tempPair.col] = true;
            }

            if(queue.isEmpty()) {
                minTime = tempPair.time;
            }
        }

        return minTime;
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

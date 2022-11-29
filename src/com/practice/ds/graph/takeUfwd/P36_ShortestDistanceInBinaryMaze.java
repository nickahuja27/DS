package com.practice.ds.graph.takeUfwd;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class P36_ShortestDistanceInBinaryMaze {
  private static int[][] grid = {
      {1, 1, 1, 1},
      {1, 1, 0, 1},
      {1, 1, 1, 1},
      {1, 1, 0, 0},
      {1, 0, 0, 1}
  };

  private static int[][] distance = new int[grid.length][grid[0].length];
  private static boolean[][] visited = new boolean[grid.length][grid[0].length];
  private static int[] SRC = {0, 1};
  private static int[] DESTINATION = {2, 2};

  public static void main(String[] args) {
    for(int i = 0; i < distance.length; i++) {
      Arrays.fill(distance[i], Integer.MAX_VALUE);
    }
    findPath();

    for(int i = 0; i < distance.length; i++) {
      System.out.println(Arrays.toString(distance[i]));
    }
  }

  private static void findPath() {
    Queue<Pair> queue = new LinkedList<>();
    queue.add(new Pair(SRC[0], SRC[1]));
    distance[SRC[0]][SRC[1]] = 0;

    while (!queue.isEmpty()) {
      Pair tempPair = queue.poll();
      visited[tempPair.row][tempPair.col] = true;

      if(isValid(tempPair.row - 1, tempPair.col)) {
        int oldValue = distance[tempPair.row - 1][tempPair.col];
        int newValue = distance[tempPair.row ][tempPair.col] + 1;
        distance[tempPair.row - 1][tempPair.col] = Math.min(oldValue, newValue);

        queue.add(new Pair(tempPair.row - 1, tempPair.col));
      }
      if(isValid(tempPair.row + 1, tempPair.col)) {
        int oldValue = distance[tempPair.row + 1][tempPair.col];
        int newValue = distance[tempPair.row ][tempPair.col] + 1;
        distance[tempPair.row + 1][tempPair.col] = Math.min(oldValue, newValue);

        queue.add(new Pair(tempPair.row + 1, tempPair.col));
      }
      if(isValid(tempPair.row, tempPair.col - 1)) {
        int oldValue = distance[tempPair.row][tempPair.col - 1];
        int newValue = distance[tempPair.row ][tempPair.col] + 1;
        distance[tempPair.row][tempPair.col - 1] = Math.min(oldValue, newValue);

        queue.add(new Pair(tempPair.row, tempPair.col - 1));
      }
      if(isValid(tempPair.row, tempPair.col + 1)) {
        int oldValue = distance[tempPair.row][tempPair.col + 1];
        int newValue = distance[tempPair.row ][tempPair.col] + 1;
        distance[tempPair.row][tempPair.col + 1] = Math.min(oldValue, newValue);

        queue.add(new Pair(tempPair.row, tempPair.col + 1));
      }
    }
  }

  private static boolean isValid(int row, int col) {
    if(row >= 0 && row < grid.length &&
        col >= 0 && col < grid[row].length &&
          !visited[row][col] &&
            grid[row][col] == 1) {
      return true;
    }
    return false;
  }

  public static class Pair {
    public int row;
    public int col;

    public Pair(int row, int col) {
      this.row = row;
      this.col = col;
    }
  }
}

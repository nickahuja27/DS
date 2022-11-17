package com.learning.ds.recursion.takeUfwd;

import java.util.ArrayList;

public class P19_RatInAMaze {
  private static int[][] maze= {
      {1, 0, 0 ,0},
      {1, 1, 0, 1},
      {1, 1, 0, 0},
      {0, 1, 1, 1}};

  private static int[] SRC = {0, 0};
  private static int[] DEST = {3, 3};
  private static boolean[][] visited = new boolean[maze.length][maze[0].length];

  public static void main(String[] args) {
    findPath(0, 0, new ArrayList<>());
  }

  private static void findPath(int x, int y, ArrayList<Character> path) {
    if(x == DEST[0] && y == DEST[1]) {
      System.out.println(path);
      return;
    }
    visited[x][y] = true;

    //UP
    if((x - 1) > 0 && !visited[x - 1][y] && maze[x - 1][y] == 1) {
      path.add('U');
      findPath(x - 1, y, path);
      path.remove(path.size() - 1);
    }

    //Down
    if((x + 1) < maze.length && !visited[x + 1][y] && maze[x + 1][y] == 1) {
      path.add('D');
      findPath(x+1, y, path);
      path.remove(path.size() - 1);
    }

    //Left
    if((y - 1) > 0 && !visited[x][y - 1] && maze[x][y - 1] == 1) {
      path.add('L');
      findPath(x, y - 1, path);
      path.remove(path.size() - 1);
    }

    //Right
    if((y + 1) < maze[0].length && !visited[x][y + 1] && maze[x][y + 1] == 1) {
      path.add('R');
      findPath(x, y + 1, path);
      path.remove(path.size() - 1);
    }

    visited[x][y] = false;


  }


}

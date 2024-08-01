package com.learning.ds.backtracking.takeUfwd;

import java.util.Arrays;

public class P14_NQueens {
    private static char[][] board = new char[4][4];
    public static void main(String[] args) {
        for(int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], '.');
        }

        boolean solution = placeQueens(0);
        System.out.println("Solution found: " + solution);
        print();
    }

    private static boolean placeQueens(int column) {
        if(column == board.length)
            return true;

        for(int i = 0; i < board.length; i++) {
            if(isSafe(i, column)) {
                board[i][column] = 'Q';
                boolean queenPlaced =  placeQueens(column + 1);
                if(queenPlaced)
                    return true;
                board[i][column] = '.';
            }
        }

        return false;
    }

    static boolean isSafe(int row, int col)
    {
        int i, j;
        for (i = 0; i < col; i++)
            if (board[row][i] == 'Q')
                return false;


        for (i = row, j = col; i >= 0 && j >= 0; i--, j--)
            if (board[i][j] == 'Q')
                return false;

        for (i = row, j = col; j >= 0 && i < board.length; i++, j--)
            if (board[i][j] == 'Q')
                return false;

        return true;
    }

    private static void print() {
        for(int i = 0; i < board.length; i++) {
            System.out.println(Arrays.toString(board[i]));
        }
    }
}

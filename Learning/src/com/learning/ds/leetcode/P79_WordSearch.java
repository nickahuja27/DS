package com.learning.ds.leetcode;

public class P79_WordSearch {
    public static void main(String[] args) {
        char[][] matrix = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}};
        boolean found = exist(matrix,"SEE");
        System.out.println(found);
    }

    public static boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == word.charAt(0)) {
                    boolean found = exist(board, word, 0, "", i, j);
                    if(found) return true;
                }
            }
        }
        return false;
    }

    public static boolean exist(char[][] board, String word, int index, String wordSoFar, int row, int col) {
        if(index >= word.length()) return false;

        if(board[row][col] == word.charAt(index)) {
            wordSoFar += board[row][col];
        }
        System.out.println("Word: "+ wordSoFar);
        if(wordSoFar.equals(word)) return true;

        board[row][col] = '#';
        if(isSafe(board, row + 1, col, word.charAt(index + 1))) {
            return exist(board, word, index + 1, wordSoFar, row + 1, col);
        }
        if(isSafe(board, row - 1, col, word.charAt(index + 1))) {
            return exist(board, word, index + 1, wordSoFar, row - 1, col);
        }
        if(isSafe(board, row, col + 1, word.charAt(index + 1))) {
            return exist(board, word, index + 1, wordSoFar, row, col + 1);
        }
        if(isSafe(board, row, col - 1, word.charAt(index + 1))) {
            return exist(board, word, index + 1, wordSoFar, row, col - 1);
        }
        return false;
    }

    private  static boolean isSafe(char[][] matrix, int row, int col, char targetChar) {
        return row >=0 && row < matrix.length &&
                col >= 0 && col < matrix[0].length &&
                matrix[row][col] == targetChar;
    }
}

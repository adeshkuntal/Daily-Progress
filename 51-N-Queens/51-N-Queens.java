// Last updated: 10/6/2025, 3:05:59 PM
import java.util.*;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }
        place_queen(board, allBoards, 0);
        return allBoards;
    }

    public static void place_queen(char[][] board, List<List<String>> allBoards, int col) {
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                place_queen(board, allBoards, col + 1);
                board[row][col] = '.';
            }
        }
    }

    public static void saveBoard(char[][] board, List<List<String>> allBoards) {
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String row = "";
            for (int j = 0; j < board.length; j++) {
                row += board[i][j];
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    public static boolean isSafe(int row, int col, char[][] board) {
        // upper-left diagonal
        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == 'Q'){
                return false;
            }
        }
        // left side
        for (int c = col; c >= 0; c--) {
            if (board[row][c] == 'Q'){
                return false;
            }
        }
        // lower-left diagonal
        for (int r = row, c = col; r < board.length && c >= 0; r++, c--) {
            if (board[r][c] == 'Q'){
                return false;
            }
        }
        return true;
    }
}

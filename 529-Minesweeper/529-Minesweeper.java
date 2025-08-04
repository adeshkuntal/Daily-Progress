// Last updated: 8/4/2025, 6:54:45 PM
public class Solution {

    private static final int[][] directions = {
        {-1, -1}, {-1, 0}, {-1, 1},
        { 0, -1},          { 0, 1},
        { 1, -1}, { 1, 0}, { 1, 1}
    };

    public char[][] updateBoard(char[][] board, int[] click) {
        int row = click[0];
        int col = click[1];

        if (board[row][col] == 'M') {
            board[row][col] = 'X';
        } else {
            dfs(board, row, col);
        }

        return board;
    }

    private void dfs(char[][] board, int row, int col) {
        if (!isValid(board, row, col) || board[row][col] != 'E') return;

        int mineCount = countAdjacentMines(board, row, col);

        if (mineCount > 0) {
            board[row][col] = (char) (mineCount + '0');
        } else {
            board[row][col] = 'B';
            for (int[] dir : directions) {
                int newRow = row + dir[0];
                int newCol = col + dir[1];
                dfs(board, newRow, newCol);
            }
        }
    }

    private int countAdjacentMines(char[][] board, int row, int col) {
        int count = 0;
        for (int[] dir : directions) {
            int newRow = row + dir[0];
            int newCol = col + dir[1];
            if (isValid(board, newRow, newCol) && board[newRow][newCol] == 'M') {
                count++;
            }
        }
        return count;
    }

    private boolean isValid(char[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board[0].length;
    }
}

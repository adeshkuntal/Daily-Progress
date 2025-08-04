// Last updated: 8/4/2025, 6:55:31 PM
class Solution {
    public int countBattleships(char[][] board) {
        int count = 0;
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                // Skip if not a battleship cell
                if (board[i][j] != 'X') continue;

                // Skip if it's part of a previous battleship (above or left)
                if (i > 0 && board[i - 1][j] == 'X') continue;
                if (j > 0 && board[i][j - 1] == 'X') continue;

                count++; 
            }
        }

        return count;
    }
}

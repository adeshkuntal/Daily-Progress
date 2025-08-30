// Last updated: 8/30/2025, 12:43:41 PM
class Solution {
    public boolean isValidSudoku(char[][] board) {
       boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') continue;
                int d = c - '1';
                if (rows[i][d]) return false;
                rows[i][d] = true;
                if (cols[j][d]) return false;
                cols[j][d] = true;
                int b = (i / 3) * 3 + (j / 3);
                if (boxes[b][d]) return false;
                boxes[b][d] = true;
            }
        }
        return true;

    }
}
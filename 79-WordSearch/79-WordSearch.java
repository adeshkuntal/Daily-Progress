// Last updated: 10/3/2025, 8:38:29 PM
class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] vis = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(i, j, vis, board, m, n, word, 0)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean dfs(int i, int j, boolean[][] vis, char[][] grid, int m, int n, String word, int idx) {
        if (idx == word.length()) {
            return true;
        }
        if (i < 0 || j < 0 || i >= m || j >= n || vis[i][j] || grid[i][j] != word.charAt(idx)){
            return false;
        }

        vis[i][j] = true;

        boolean found = dfs(i - 1, j, vis, grid, m, n, word, idx + 1) || // top
                        dfs(i, j + 1, vis, grid, m, n, word, idx + 1) || // right
                        dfs(i + 1, j, vis, grid, m, n, word, idx + 1) || // bottom
                        dfs(i, j - 1, vis, grid, m, n, word, idx + 1);   // left

        vis[i][j] = false; // backtrack
        
        return found;
    }
}

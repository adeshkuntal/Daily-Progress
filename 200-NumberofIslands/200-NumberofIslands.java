// Last updated: 9/29/2025, 10:21:32 PM
class Solution {
    public int numIslands(char[][] grid) {
        int islands = 0;
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] vis = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == '1' && !vis[i][j]) {
                    dfs(i, j, vis, grid, m, n);
                    islands++;
                }
            }
        }
        return islands;
    }

    void dfs(int i, int j, boolean[][] vis, char[][] grid, int m, int n) {
        if (i < 0 || j < 0 || i >= m || j >= n || vis[i][j] || grid[i][j] != '1') {
            return;
        }

        vis[i][j] = true;

        dfs(i - 1, j, vis, grid, m, n); // top
        dfs(i, j + 1, vis, grid, m, n); // right
        dfs(i + 1, j, vis, grid, m, n); // bottom
        dfs(i, j - 1, vis, grid, m, n); // left
    }
}

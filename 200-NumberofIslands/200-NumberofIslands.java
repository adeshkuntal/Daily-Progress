// Last updated: 12/30/2025, 11:44:30 AM
1class Solution {
2    public int numIslands(char[][] grid) {
3        int islands = 0;
4        int m = grid.length;
5        int n = grid[0].length;
6        boolean[][] vis = new boolean[m][n];
7
8        for (int i = 0; i < m; i++) {
9            for (int j = 0; j < n; j++) {
10                if (grid[i][j] == '1' && !vis[i][j]) {
11                    dfs(i, j, vis, grid, m, n);
12                    islands++;
13                }
14            }
15        }
16        return islands;
17    }
18
19    void dfs(int i, int j, boolean[][] vis, char[][] grid, int m, int n) {
20        if (i < 0 || j < 0 || i >= m || j >= n || vis[i][j] || grid[i][j] != '1') {
21            return;
22        }
23
24        vis[i][j] = true;
25
26        dfs(i - 1, j, vis, grid, m, n); // top
27        dfs(i, j + 1, vis, grid, m, n); // right
28        dfs(i + 1, j, vis, grid, m, n); // bottom
29        dfs(i, j - 1, vis, grid, m, n); // left
30    }
31}
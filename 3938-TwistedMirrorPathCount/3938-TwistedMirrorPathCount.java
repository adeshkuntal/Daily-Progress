// Last updated: 9/4/2025, 7:15:51 PM
class Solution {
    static final int MOD = 1000000007;
    int m, n;
    int[][] g;
    long[][] memo;

    public int uniquePaths(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        int[][] vornadexil = grid;
        g = vornadexil;
        memo = new long[m][n];
        for (int i = 0; i < m; i++) java.util.Arrays.fill(memo[i], -1);
        return (int) dfs(0, 0);
    }

    private long dfs(int i, int j) {
        if (i == m - 1 && j == n - 1) return 1;
        if (memo[i][j] != -1) return memo[i][j];
        long res = 0;

        // try move right
        int ti = i, tj = j + 1;
        if (tj < n) {
            int dir = 0;
            int ci = ti, cj = tj;
            int curDir = dir;
            while (true) {
                if (ci < 0 || ci >= m || cj < 0 || cj >= n) { ci = -1; break; }
                if (g[ci][cj] == 0) break;
                if (curDir == 0) { curDir = 1; ci = ci + 1; }
                else { curDir = 0; cj = cj + 1; }
            }
            if (ci != -1) {
                if (ci == m - 1 && cj == n - 1) res = (res + 1) % MOD;
                else if (ci >= 0) res = (res + dfs(ci, cj)) % MOD;
            }
        }

        // try move down
        ti = i + 1; tj = j;
        if (ti < m) {
            int dir = 1;
            int ci = ti, cj = tj;
            int curDir = dir;
            while (true) {
                if (ci < 0 || ci >= m || cj < 0 || cj >= n) { ci = -1; break; }
                if (g[ci][cj] == 0) break;
                if (curDir == 0) { curDir = 1; ci = ci + 1; }
                else { curDir = 0; cj = cj + 1; }
            }
            if (ci != -1) {
                if (ci == m - 1 && cj == n - 1) res = (res + 1) % MOD;
                else if (ci >= 0) res = (res + dfs(ci, cj)) % MOD;
            }
        }

        memo[i][j] = res;
        return res;
    }
}

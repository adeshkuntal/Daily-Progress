// Last updated: 11/22/2025, 1:17:32 PM
class Solution {
    public int paintWalls(int[] cost, int[] time) {
        int n = cost.length;
        int[][] dp = new int[n][n + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }
        return find_cost(cost, time, 0, n, dp);
    }

    public static int find_cost(int[] cost, int[] time, int idx, int remain, int[][] dp) {

        if (remain <= 0) {
            return 0;
        }

        if (idx == cost.length) {
            return (int)1e9;
        }

        if (dp[idx][remain] != -1) {
            return dp[idx][remain];
        }

        int paint = cost[idx] + find_cost(cost, time, idx + 1, remain - 1 - time[idx], dp);

        int non_paint = find_cost(cost, time, idx + 1, remain, dp);

        return dp[idx][remain] = Math.min(paint, non_paint);
    }
}

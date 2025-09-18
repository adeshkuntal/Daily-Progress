// Last updated: 9/18/2025, 12:23:22 PM
import java.util.Arrays;

class Solution {
    public int maxCoins(int[] nums) {
        int[] a = new int[nums.length + 2];
        a[0] = a[a.length - 1] = 1;

        for (int i = 0; i < nums.length; i++) {
            a[i + 1] = nums[i];
        }

        int[][] dp = new int[a.length][a.length];
        for (int[] row : dp) Arrays.fill(row, -1);

        return Burst_Coin(a, 0, a.length - 1, dp);
    }

    private int Burst_Coin(int[] a, int i, int j, int[][] dp) {
        if (i + 1 == j) return 0;  // no balloons to burst
        if (dp[i][j] != -1) return dp[i][j];

        int ans = 0;
        for (int k = i + 1; k < j; k++) {
            int left = Burst_Coin(a, i, k, dp);
            int right = Burst_Coin(a, k, j, dp);
            int self = a[i] * a[k] * a[j];

            ans = Math.max(ans, left + right + self);
        }
        return dp[i][j] = ans;
    }
}
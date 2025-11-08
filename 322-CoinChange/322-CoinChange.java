// Last updated: 11/8/2025, 2:28:12 PM
import java.util.*;

class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, -1);

        int res = find_coin(coins, amount, dp);
        return res == Integer.MAX_VALUE ? -1 : res;
    }

    public static int find_coin(int[] coins, int amount, int[] dp) {
        if (amount == 0) {
            return 0;
        }
        if (amount < 0) {
            return Integer.MAX_VALUE;
        }
        if (dp[amount] != -1) {
            return dp[amount];
        }

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < coins.length; i++) {
            int res = find_coin(coins, amount - coins[i], dp);
            if (res != Integer.MAX_VALUE) {
                min = Math.min(min, res + 1);
            }
        }
        dp[amount] = min;
        return min;
    }
}

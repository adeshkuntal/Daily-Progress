// Last updated: 11/8/2025, 2:51:30 PM
// import java.util.*;

// class Solution {
//     public int coinChange(int[] coins, int amount) {
//         int[] dp = new int[amount + 1];
//         Arrays.fill(dp, -1);

//         int res = find_coin(coins, amount, dp);
//         return res == Integer.MAX_VALUE ? -1 : res;
//     }

//     public static int find_coin(int[] coins, int amount, int[] dp) {
//         if (amount == 0) {
//             return 0;
//         }
//         if (amount < 0) {
//             return Integer.MAX_VALUE;
//         }
//         if (dp[amount] != -1) {
//             return dp[amount];
//         }

//         int min = Integer.MAX_VALUE;
//         for (int i = 0; i < coins.length; i++) {
//             int res = find_coin(coins, amount - coins[i], dp);
//             if (res != Integer.MAX_VALUE) {
//                 min = Math.min(min, res + 1);
//             }
//         }
//         dp[amount] = min;
//         return min;
//     }
// }



//Tabulation
class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);

        if (amount == 0) {
            return 0;
        }

        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0 && dp[i - coins[j]] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                }
            }
        }

        return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
    }
}


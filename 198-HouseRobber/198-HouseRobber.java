// Last updated: 2/11/2026, 8:33:59 PM
1class Solution {
2    public int coinChange(int[] coins, int amount) {
3        int[] dp = new int[amount + 1];
4        Arrays.fill(dp, -1);
5
6        int res = find_coin(coins, amount, dp);
7        return res == Integer.MAX_VALUE ? -1 : res;
8    }
9
10    public static int find_coin(int[] coins, int amount, int[] dp) {
11        if (amount == 0) {
12            return 0;
13        }
14        if (amount < 0) {
15            return Integer.MAX_VALUE;
16        }
17        if (dp[amount] != -1) {
18            return dp[amount];
19        }
20
21        int min = Integer.MAX_VALUE;
22        for (int i = 0; i < coins.length; i++) {
23            int res = find_coin(coins, amount - coins[i], dp);
24            if (res != Integer.MAX_VALUE) {
25                min = Math.min(min, res + 1);
26            }
27        }
28        dp[amount] = min;
29        return min;
30    }
31}
32
33
34
35//Tabulation
36// class Solution {
37//     public int coinChange(int[] coins, int amount) {
38//         int[] dp = new int[amount + 1];
39//         Arrays.fill(dp, Integer.MAX_VALUE);
40
41//         if (amount == 0) {
42//             return 0;
43//         }
44
45//         dp[0] = 0;
46//         for (int i = 1; i <= amount; i++) {
47//             for (int j = 0; j < coins.length; j++) {
48//                 if (i - coins[j] >= 0 && dp[i - coins[j]] != Integer.MAX_VALUE) {
49//                     dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
50//                 }
51//             }
52//         }
53
54//         return dp[amount] == Integer.MAX_VALUE ? -1 : dp[amount];
55//     }
56// }
57
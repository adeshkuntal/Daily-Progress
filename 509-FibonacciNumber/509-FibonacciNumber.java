// Last updated: 12/29/2025, 8:32:36 PM
1class Solution {
2    public int fib(int n) {
3        int[] dp = new int[n + 1];
4        Arrays.fill(dp, -1);
5        return fn(n, dp);
6    }
7
8    public static int fn(int n, int[] dp) {
9        if (n == 0) {
10            return 0;
11        }
12        if (n == 1) {
13            return 1;
14        }
15        if (dp[n] != -1) {
16            return dp[n];
17        }
18
19        dp[n] = fn(n - 1, dp) + fn(n - 2, dp);
20        return dp[n];
21    }
22}
23
// Last updated: 2/11/2026, 7:03:03 PM
1class Solution {
2    public int climbStairs(int n) {
3        int[] dp = new int[n+1];
4        Arrays.fill(dp,-1);
5        return fn(n,dp);
6    }
7    public int fn(int n,int[] dp) {
8        if (n == 0) {
9            return 1;
10        }
11        if(dp[n] != -1){
12            return dp[n];
13        }
14        int oneStep = 0;
15        int twoStep = 0;
16
17        if (n >= 1) {
18            oneStep = fn(n - 1,dp);
19        }
20        if (n >= 2) {
21            twoStep = fn(n - 2,dp);
22        }
23
24        return dp[n] = oneStep + twoStep;
25    }
26}
27
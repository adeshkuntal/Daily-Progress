// Last updated: 1/6/2026, 3:59:38 PM
1class Solution {
2    public int tribonacci(int n) {
3        int[] dp = new int[n+1];
4        Arrays.fill(dp,-1);
5        return fn(n,dp);
6        
7    }
8    public int fn(int n,int[] dp){
9        if(n == 0){
10            return 0;
11        }
12        if(n == 1){
13            return 1;
14        }
15        if(n == 2){
16            return 1;
17        }
18        if(dp[n] != -1){
19            return dp[n];
20        }
21
22        return dp[n] = fn(n-3,dp)+fn(n-2,dp)+fn(n-1,dp);
23    }
24}
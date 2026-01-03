// Last updated: 1/3/2026, 12:48:41 PM
1class Solution {
2    public int rob(int[] nums) {
3        int[] dp = new int[nums.length];
4        Arrays.fill(dp, -1);
5        return Robber(nums, 0, dp);
6    }
7    public int Robber(int[] nums, int i, int[] dp) {
8        if(i >= nums.length) {
9            return 0;
10        }
11        if(dp[i] != -1) {
12            return dp[i];
13        }
14        int rob = nums[i] + Robber(nums,i+2,dp);
15        int donotRob = Robber(nums,i+1,dp);
16
17        dp[i] = Math.max(rob,donotRob);
18
19        return dp[i];
20    }
21}
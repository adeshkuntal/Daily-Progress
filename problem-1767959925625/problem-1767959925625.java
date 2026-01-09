// Last updated: 1/9/2026, 5:28:45 PM
1class Solution {
2    public int rob(int[] nums){
3        int[] dp = new int[nums.length];
4        Arrays.fill(dp,-1);
5        return money(nums,0,dp);
6        
7    }
8    public int money(int[] nums,int idx,int[] dp){
9        if(idx >= nums.length){
10            return 0;
11        }
12        if(dp[idx] != -1){
13            return dp[idx];
14        }
15        int robb = nums[idx] + money(nums,idx+2,dp);
16        int not_robb = money(nums,idx+1,dp);
17
18        dp[idx] = Math.max(robb,not_robb);
19
20        return dp[idx];
21    }
22}
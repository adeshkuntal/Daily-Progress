// Last updated: 1/9/2026, 7:35:25 PM
1// class Solution {
2//     public int rob(int[] nums){
3//         int[] dp = new int[nums.length];
4//         Arrays.fill(dp,-1);
5//         return money(nums,0,dp);
6        
7//     }
8//     public int money(int[] nums,int idx,int[] dp){
9//         if(idx >= nums.length){
10//             return 0;
11//         }
12//         if(dp[idx] != -1){
13//             return dp[idx];
14//         }
15//         int robb = nums[idx] + money(nums,idx+2,dp);
16//         int not_robb = money(nums,idx+1,dp);
17
18//         dp[idx] = Math.max(robb,not_robb);
19
20//         return dp[idx];
21//     }
22// }
23
24
25
26class Solution {
27    public int rob(int[] nums){
28        if(nums.length == 1){
29            return nums[0];
30        }
31        int n = nums.length;
32        int[] dp = new int[n];
33        dp[0] = nums[0];
34        dp[1] = Math.max(nums[0],nums[1]);
35        for(int i=2; i<nums.length; i++){
36            int robb = nums[i]+dp[i-2];
37            int not_robb = dp[i-1];
38            dp[i] = Math.max(robb,not_robb);
39        }
40        
41        return dp[n-1];
42    }
43    
44}
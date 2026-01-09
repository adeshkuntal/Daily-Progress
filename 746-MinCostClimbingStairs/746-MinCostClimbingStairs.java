// Last updated: 1/9/2026, 8:01:58 PM
1class Solution {
2    public int minCostClimbingStairs(int[] cost) {
3        int n = cost.length;
4        int[] dp = new int[n+1];
5        Arrays.fill(dp,-1);
6        int ans = Math.min(findCost(cost,0,dp),findCost(cost,1,dp));
7        return ans;
8    }
9    public static int findCost(int[] cost,int n,int[] dp){
10        if(n >= cost.length){
11            return 0;
12        }
13        if(dp[n] != -1){
14            return dp[n];
15        }
16        int one_step = findCost(cost,n+1,dp);
17        int two_step = findCost(cost,n+2,dp);
18        dp[n] = cost[n] + Math.min(one_step,two_step);
19        return dp[n];
20    }
21}
22
23
24
25
26
27
28
29
30// class Solution {
31//     public int minCostClimbingStairs(int[] cost) {
32//         int n = cost.length;
33//         int[] dp = new int[n+1];
34//         Arrays.fill(dp,-1);
35//         if(n == 1){
36//             return cost[1];
37//         }
38//         dp[0] = cost[0];
39//         dp[1] = cost[1];
40//         for (int i = 2; i < n; i++) {
41//             dp[i] = cost[i] + Math.min(dp[i - 1] , dp[i - 2]);
42//         }
43//         return Math.min(dp[n-1],dp[n-2]);
44//     }
45    
46// }
47
48
49
50
51
52
53
54// class Solution {
55//     public int minCostClimbingStairs(int[] cost) {
56//         int n = cost.length;
57//         if(n == 1){
58//             return cost[1];
59//         }
60//         int prev2 = cost[0];
61//         int prev1 = cost[1];
62//         for (int i = 2; i < n; i++) {
63//             int curr = cost[i] + Math.min(prev1 , prev2);
64//             prev2 = prev1;
65//             prev1 = curr;
66//         }
67//         return Math.min(prev1,prev2);
68//     }
69    
70// }
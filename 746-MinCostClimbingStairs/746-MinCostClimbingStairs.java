// Last updated: 1/9/2026, 7:55:53 PM
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
16
17        dp[n] = cost[n] + Math.min(findCost(cost,n+1,dp),findCost(cost,n+2,dp));
18        return dp[n];
19    }
20}
21
22
23
24
25
26
27
28
29// class Solution {
30//     public int minCostClimbingStairs(int[] cost) {
31//         int n = cost.length;
32//         int[] dp = new int[n+1];
33//         Arrays.fill(dp,-1);
34//         if(n == 1){
35//             return cost[1];
36//         }
37//         dp[0] = cost[0];
38//         dp[1] = cost[1];
39//         for (int i = 2; i < n; i++) {
40//             dp[i] = cost[i] + Math.min(dp[i - 1] , dp[i - 2]);
41//         }
42//         return Math.min(dp[n-1],dp[n-2]);
43//     }
44    
45// }
46
47
48
49
50
51
52
53// class Solution {
54//     public int minCostClimbingStairs(int[] cost) {
55//         int n = cost.length;
56//         if(n == 1){
57//             return cost[1];
58//         }
59//         int prev2 = cost[0];
60//         int prev1 = cost[1];
61//         for (int i = 2; i < n; i++) {
62//             int curr = cost[i] + Math.min(prev1 , prev2);
63//             prev2 = prev1;
64//             prev1 = curr;
65//         }
66//         return Math.min(prev1,prev2);
67//     }
68    
69// }
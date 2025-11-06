// Last updated: 11/6/2025, 8:50:12 PM
// class Solution {
//     public int minCostClimbingStairs(int[] cost) {
//         int n = cost.length;
//         int[] dp = new int[n+1];
//         Arrays.fill(dp,-1);
//         int ans = Math.min(findCost(cost,n-1,dp),findCost(cost,n-2,dp));
//         return ans;
//     }
//     public static int findCost(int[] cost,int n,int[] dp){
//         if(n == 0){
//             return cost[0];
//         }
//         if(n == 1){
//             return cost[1];
//         }
//         if(dp[n] != -1){
//             return dp[n];
//         }

//         dp[n] = cost[n] + Math.min(findCost(cost,n-1,dp),findCost(cost,n-2,dp));
//         return dp[n];
//     }
// }














class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        if(n == 1){
            return cost[1];
        }
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < n; i++) {
            dp[i] = cost[i] + Math.min(dp[i - 1] , dp[i - 2]);
        }
        return Math.min(dp[n-1],dp[n-2]);
    }
    
}
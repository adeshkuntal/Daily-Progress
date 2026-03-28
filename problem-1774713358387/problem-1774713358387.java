// Last updated: 3/28/2026, 9:25:58 PM
1class Solution {
2    public int minCost(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5
6        HashSet<Integer>[][] dp = new HashSet[m][n];
7        for(int i=0; i<m; i++){
8            for(int j=0; j<n; j++){
9                dp[i][j] = new HashSet<>();
10            }
11        }
12        dp[0][0].add(grid[0][0]);
13
14        for(int i=0; i<m; i++){
15            for(int j=0; j<n; j++){
16                if(i == 0 && j== 0) continue;
17                if(i > 0){
18                    for(int val : dp[i-1][j]){
19                        dp[i][j].add(val^grid[i][j]);
20                    }
21                }
22                if(j > 0){
23                    for(int val : dp[i][j-1]){
24                        dp[i][j].add(val^grid[i][j]);
25                    }
26                }
27            }
28        }
29        int ans = Integer.MAX_VALUE;
30        for(int val : dp[m-1][n-1]){
31            ans = Math.min(ans,val);
32        }
33        return ans;
34    }
35}
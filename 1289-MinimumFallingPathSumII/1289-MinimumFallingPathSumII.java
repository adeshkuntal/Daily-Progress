// Last updated: 1/11/2026, 1:20:35 PM
1class Solution {
2    public int minFallingPathSum(int[][] grid) {
3        int[][] dp = new int[grid.length][grid[0].length];
4        for(int[] a : dp){
5            Arrays.fill(a,-1000000);
6        }
7        int res = Integer.MAX_VALUE;
8        for(int j=0; j<grid[0].length; j++){
9            res = Math.min(res,fn(grid,0,j,dp));
10        }
11        return res;
12    }
13    public int fn(int[][] grid,int i,int j,int[][] dp){
14        if(j < 0 || j >= grid[0].length){
15            return Integer.MAX_VALUE;
16        }
17        if(i == grid.length-1){
18            return grid[i][j];
19        }
20        if(dp[i][j] != -1000000){
21            return dp[i][j];
22        }
23        int ans = Integer.MAX_VALUE;
24        for(int k=0; k<grid[0].length; k++){
25            if(j !=  k){
26                ans = Math.min(ans,fn(grid,i+1,k,dp));
27            }
28        }
29
30        return dp[i][j] = ans + grid[i][j];
31    }
32}
33
34
35
36
37
38
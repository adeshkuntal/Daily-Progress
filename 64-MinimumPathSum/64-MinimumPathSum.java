// Last updated: 1/11/2026, 12:26:35 PM
1class Solution {
2    public int minPathSum(int[][] grid) {
3        int[][] dp = new int[grid.length][grid[0].length];
4        for(int[] a : dp){
5            Arrays.fill(a,-1);
6        }
7        return fn(grid,0,0,dp);
8    }
9    public int fn(int[][] grid,int i,int j,int[][] dp){
10        if(i == grid.length-1 && j == grid[0].length-1){
11            return grid[i][j];
12        }
13        if(i >= grid.length || j >= grid[0].length){
14            return Integer.MAX_VALUE;
15        }
16        if(dp[i][j] != -1){
17            return dp[i][j];
18        }
19        int forward = fn(grid,i,j+1,dp);
20        int down = fn(grid,i+1,j,dp);
21        return dp[i][j] = Math.min(forward,down) + grid[i][j];
22    }
23}
// Last updated: 2/20/2026, 10:01:15 PM
1class Solution {
2    public int getMaximumGold(int[][] grid) {
3        int res = 0;
4        for(int i=0; i<grid.length; i++){
5            for(int j=0; j<grid[0].length; j++){
6                if(grid[i][j] != 0){
7                    int ans = dfs(grid,i,j);
8                    res = Math.max(res,ans);
9                }
10            }
11        }
12        return res;
13    }
14
15    public int dfs(int[][] grid,int i,int j){
16        if(i<0 || i>= grid.length || j<0 || j>= grid[0].length || grid[i][j]==0){
17            return 0;
18        }
19
20        int gold = grid[i][j];
21        grid[i][j] = 0;
22
23        int top = dfs(grid,i - 1, j);
24        int right = dfs(grid,i, j + 1);
25        int bottom = dfs(grid,i + 1, j);
26        int left = dfs(grid,i, j - 1);
27
28        grid[i][j] = gold;
29
30        return gold + Math.max(top,Math.max(right,Math.max(bottom,left)));
31    }
32}
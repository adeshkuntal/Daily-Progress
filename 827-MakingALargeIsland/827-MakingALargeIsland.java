// Last updated: 3/10/2026, 12:20:03 PM
1class Solution {
2    public int largestIsland(int[][] grid) {
3
4        int n = grid.length;
5        int island = 0;
6
7        int[][] vis = new int[n][n];
8        int mark = 1;
9
10        for(int i=0;i<n;i++){
11            for(int j=0;j<n;j++){
12
13                if(grid[i][j]==0){
14
15                    grid[i][j]=1;
16
17                    int curr = dfs(i,j,vis,grid,n,mark);
18
19                    island = Math.max(island,curr);
20
21                    grid[i][j]=0;
22
23                    mark++;
24                }
25            }
26        }
27
28        if(island==0) return n*n;
29
30        return island;
31    }
32
33    public int dfs(int i,int j,int[][] vis,int[][] grid,int n,int mark){
34
35        if(i<0 || j<0 || i>=n || j>=n || vis[i][j]==mark || grid[i][j]==0){
36            return 0;
37        }
38
39        vis[i][j] = mark;
40
41        int area = 1;
42
43        area += dfs(i+1,j,vis,grid,n,mark);
44        area += dfs(i-1,j,vis,grid,n,mark);
45        area += dfs(i,j+1,vis,grid,n,mark);
46        area += dfs(i,j-1,vis,grid,n,mark);
47
48        return area;
49    }
50}
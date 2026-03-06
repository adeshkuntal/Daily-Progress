// Last updated: 3/6/2026, 1:01:06 PM
1class Solution {
2    public int numEnclaves(int[][] grid) {
3        int m = grid.length;
4        int n = grid[0].length;
5
6        Queue<int[]> q = new LinkedList<>();
7
8        for(int i=0;i<m;i++){
9            if(grid[i][0]==1){
10                q.add(new int[]{i,0});
11                grid[i][0]=0;
12            }
13            if(grid[i][n-1]==1){
14                q.add(new int[]{i,n-1});
15                grid[i][n-1]=0;
16            }
17        }
18
19        for(int j=0;j<n;j++){
20            if(grid[0][j]==1){
21                q.add(new int[]{0,j});
22                grid[0][j]=0;
23            }
24            if(grid[m-1][j]==1){
25                q.add(new int[]{m-1,j});
26                grid[m-1][j]=0;
27            }
28        }
29
30        int[][] dir={{1,0},{-1,0},{0,1},{0,-1}};
31
32        while(!q.isEmpty()){
33            int[] cur=q.poll();
34
35            for(int[] d:dir){
36                int x=cur[0]+d[0];
37                int y=cur[1]+d[1];
38
39                if(x>=0 && y>=0 && x<m && y<n && grid[x][y]==1){
40                    grid[x][y]=0;
41                    q.add(new int[]{x,y});
42                }
43            }
44        }
45
46        int count=0;
47
48        for(int i=0;i<m;i++){
49            for(int j=0;j<n;j++){
50                if(grid[i][j]==1) count++;
51            }
52        }
53
54        return count;
55    }
56}
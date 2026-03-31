// Last updated: 3/31/2026, 11:45:28 AM
1class Solution {
2    public int shortestPathBinaryMatrix(int[][] grid) {
3        int n = grid.length;
4        
5        if(grid[0][0] == 1 || grid[n-1][n-1] == 1){
6            return -1;
7        }
8
9        int[][] dir = {
10            {1,0},{-1,0},{0,1},{0,-1},
11            {1,1},{1,-1},{-1,1},{-1,-1}
12        };
13
14        Queue<int[]> q = new LinkedList<>();
15        q.add(new int[]{0,0});
16
17        boolean[][] vis = new boolean[n][n];
18        vis[0][0] = true;
19
20        int count = 1;
21
22        while(!q.isEmpty()){
23            int size = q.size();
24
25            for(int i=0;i<size;i++){
26                int[] curr = q.poll();
27
28                if(curr[0] == n-1 && curr[1] == n-1){
29                    return count;
30                }
31
32                for(int[] d: dir){
33                    int x = curr[0] + d[0];
34                    int y = curr[1] + d[1];
35
36                    if(x>=0 && x<n && y>=0 && y<n && grid[x][y]==0 && !vis[x][y]){
37                        vis[x][y] = true;
38                        q.add(new int[]{x,y});
39                    }
40                }
41            }
42
43            count++;
44        }
45
46        return -1;
47    }
48}
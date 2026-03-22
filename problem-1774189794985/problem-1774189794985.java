// Last updated: 3/22/2026, 7:59:54 PM
1import java.util.*;
2
3class Solution {
4    public int orangesRotting(int[][] grid) {
5        int m = grid.length;
6        int n = grid[0].length;
7
8        Queue<int[]> q = new LinkedList<>();
9        int fresh = 0;
10
11        for(int i=0;i<m;i++){
12            for(int j=0;j<n;j++){
13                if(grid[i][j]==2){
14                    q.add(new int[]{i,j});
15                }
16                if(grid[i][j]==1){
17                    fresh++;
18                }
19            }
20        }
21
22        int time = 0;
23        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
24
25        while(!q.isEmpty() && fresh>0){
26            int size = q.size();
27
28            for(int i=0;i<size;i++){
29                int[] cur = q.poll();
30
31                for(int[] d:dir){
32                    int x = cur[0]+d[0];
33                    int y = cur[1]+d[1];
34
35                    if(x>=0 && y>=0 && x<m && y<n && grid[x][y]==1){
36                        grid[x][y]=2;
37                        fresh--;
38                        q.offer(new int[]{x,y});
39                    }
40                }
41            }
42            time++;
43        }
44
45        if(fresh>0){
46            return -1;
47        }
48        return time;
49    }
50}
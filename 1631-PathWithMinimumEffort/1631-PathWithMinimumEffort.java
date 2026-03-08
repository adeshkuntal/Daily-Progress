// Last updated: 3/8/2026, 11:38:40 AM
1import java.util.*;
2
3class Solution {
4    public int minimumEffortPath(int[][] grid) {
5        int n = grid.length;
6        int m = grid[0].length;
7
8        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
9        int[][] effort = new int[n][m];
10
11        for(int i=0;i<n;i++){
12            Arrays.fill(effort[i], Integer.MAX_VALUE);
13        }
14
15        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[2]-b[2]);
16        pq.add(new int[]{0,0,0});
17        effort[0][0] = 0;
18
19        while(!pq.isEmpty()){
20            int[] curr = pq.poll();
21
22            if(curr[0]==n-1 && curr[1]==m-1){
23                return curr[2];
24            }
25
26            for(int[] d : dir){
27                int x = curr[0] + d[0];
28                int y = curr[1] + d[1];
29                int e = curr[2];
30
31                if(x>=0 && y>=0 && x<n && y<m){
32                    int ne = Math.max(e, Math.abs(grid[x][y]-grid[curr[0]][curr[1]]));
33
34                    if(ne < effort[x][y]){
35                        effort[x][y] = ne;
36                        pq.add(new int[]{x,y,ne});
37                    }
38                }
39            }
40        }
41
42        return 0;
43    }
44}
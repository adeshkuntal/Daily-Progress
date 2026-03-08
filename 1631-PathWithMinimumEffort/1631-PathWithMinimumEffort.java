// Last updated: 3/8/2026, 11:34:41 AM
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
21            int x = curr[0];
22            int y = curr[1];
23            int e = curr[2];
24
25            if(x==n-1 && y==m-1) return e;
26
27            for(int[] d : dir){
28                int nx = x + d[0];
29                int ny = y + d[1];
30
31                if(nx>=0 && ny>=0 && nx<n && ny<m){
32                    int ne = Math.max(e, Math.abs(grid[nx][ny]-grid[x][y]));
33
34                    if(ne < effort[nx][ny]){
35                        effort[nx][ny] = ne;
36                        pq.add(new int[]{nx,ny,ne});
37                    }
38                }
39            }
40        }
41
42        return 0;
43    }
44}
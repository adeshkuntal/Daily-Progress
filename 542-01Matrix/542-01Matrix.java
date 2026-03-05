// Last updated: 3/5/2026, 2:41:02 PM
1import java.util.*;
2
3class Solution {
4    public int[][] updateMatrix(int[][] mat) {
5        int m = mat.length;
6        int n = mat[0].length;
7
8        int[][] dist = new int[m][n];
9        Queue<int[]> q = new LinkedList<>();
10
11        for(int i=0;i<m;i++){
12            for(int j=0;j<n;j++){
13                if(mat[i][j]==0){
14                    q.offer(new int[]{i,j});
15                }else{
16                    dist[i][j] = -1;
17                }
18            }
19        }
20
21        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
22
23        while(!q.isEmpty()){
24            int[] cur = q.poll();
25
26            for(int[] d : dir){
27                int x = cur[0] + d[0];
28                int y = cur[1] + d[1];
29
30                if(x>=0 && y>=0 && x<m && y<n && dist[x][y]==-1){
31                    dist[x][y] = dist[cur[0]][cur[1]] + 1;
32                    q.offer(new int[]{x,y});
33                }
34            }
35        }
36
37        return dist;
38    }
39}
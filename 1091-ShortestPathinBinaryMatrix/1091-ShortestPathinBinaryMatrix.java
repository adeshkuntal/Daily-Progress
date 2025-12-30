// Last updated: 12/30/2025, 12:50:03 PM
1import java.util.*;
2
3class Solution {
4    public int shortestPathBinaryMatrix(int[][] grid) {
5        int m = grid.length;
6        int n = grid[0].length;
7
8        if (grid[0][0] == 1 || grid[m - 1][n - 1] == 1) return -1;
9
10        boolean[][] vis = new boolean[m][n];
11        Queue<int[]> q = new LinkedList<>();
12
13        q.add(new int[]{0, 0, 1});
14        vis[0][0] = true;
15
16        int[] dx = {-1,-1,-1,0,0,1,1,1};
17        int[] dy = {-1,0,1,-1,1,-1,0,1};
18
19        while (!q.isEmpty()) {
20            int[] cur = q.poll();
21            int x = cur[0];
22            int y = cur[1];
23            int dist = cur[2];
24
25            if (x == m - 1 && y == n - 1) return dist;
26
27            for (int k = 0; k < 8; k++) {
28                int nx = x + dx[k];
29                int ny = y + dy[k];
30
31                if (nx >= 0 && ny >= 0 && nx < m && ny < n &&
32                    grid[nx][ny] == 0 && !vis[nx][ny]) {
33                    vis[nx][ny] = true;
34                    q.add(new int[]{nx, ny, dist + 1});
35                }
36            }
37        }
38        return -1;
39    }
40}
41
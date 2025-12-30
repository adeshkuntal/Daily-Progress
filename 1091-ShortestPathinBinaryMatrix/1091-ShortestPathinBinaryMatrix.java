// Last updated: 12/30/2025, 1:22:40 PM
1class Solution {
2    public int shortestPathBinaryMatrix(int[][] grid) {
3        int n = grid.length;
4        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) {
5            return -1;
6        }
7
8        int[][] directions = {
9            {1, 0}, {-1, 0}, {0, 1}, {0, -1},
10            {1, 1}, {1, -1}, {-1, 1}, {-1, -1}
11        };
12
13        boolean[][] visited = new boolean[n][n];
14        Queue<int[]> queue = new LinkedList<>();
15        queue.add(new int[] {0, 0, 1}); // row, col, distance
16        visited[0][0] = true;
17
18        while (!queue.isEmpty()) {
19            int[] cur = queue.poll();
20            int r = cur[0], c = cur[1], dist = cur[2];
21
22            if (r == n - 1 && c == n - 1) {
23                return dist;
24            }
25
26            for (int[] d : directions) {
27                int nr = r + d[0];
28                int nc = c + d[1];
29
30                if (nr >= 0 && nr < n && nc >= 0 && nc < n &&
31                    !visited[nr][nc] && grid[nr][nc] == 0) {
32                    visited[nr][nc] = true;
33                    queue.offer(new int[] {nr, nc, dist + 1});
34                }
35            }
36        }
37
38        return -1;
39    }
40}
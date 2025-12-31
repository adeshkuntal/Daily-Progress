// Last updated: 12/31/2025, 9:54:25 PM
1class Solution {
2    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
3        int[][] dirs = new int[][]{{1,0},{-1,0},{0,-1},{0,1}};
4        int m = grid.size();
5        int n = grid.get(0).size();
6        int[][] visitedCost = new int[m][n];
7        Queue<int[]> queue = new LinkedList<>();
8        queue.offer(new int[]{0, 0, health - grid.get(0).get(0)});
9        visitedCost[0][0] = health - grid.get(0).get(0);
10        while(!queue.isEmpty()) {
11            int size = queue.size();
12            for(int i = 0; i < size; i++) {
13                int[] polled = queue.poll();
14                int r = polled[0];
15                int c = polled[1];
16                int h = polled[2];
17                if (r == m-1 && c == n-1) {
18                    return true;
19                }
20                for(int[] dir: dirs) {
21                    int nr = dir[0] + r;
22                    int nc = dir[1] + c;
23                    if (0 <= nr && nr < m && 0 <= nc && nc < n &&
24                        h > visitedCost[nr][nc] + grid.get(nr).get(nc) &&
25                        h > grid.get(nr).get(nc)) {
26                        visitedCost[nr][nc] = h - grid.get(nr).get(nc);
27                        queue.offer(new int[]{nr, nc, h - grid.get(nr).get(nc)});
28                    }
29                }
30            }
31        }
32        return false;
33    }
34}
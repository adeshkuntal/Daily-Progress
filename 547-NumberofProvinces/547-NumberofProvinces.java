// Last updated: 12/30/2025, 4:16:36 PM
1class Solution {
2    public int findCircleNum(int[][] isConnected) {
3        int n = isConnected.length;
4        boolean[] visited = new boolean[n];
5        int provinces = 0;
6
7        for (int i = 0; i < n; i++) {
8            if (!visited[i]) {
9                dfs(i, isConnected, visited);
10                provinces++;
11            }
12        }
13
14        return provinces;
15    }
16
17    private void dfs(int city, int[][] isConnected, boolean[] visited) {
18        visited[city] = true;
19        for (int i = 0; i < isConnected.length; i++) {
20            if (isConnected[city][i] == 1 && !visited[i]) {
21                dfs(i, isConnected, visited);
22            }
23        }
24    }
25}
26
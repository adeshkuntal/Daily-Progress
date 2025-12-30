// Last updated: 12/30/2025, 9:06:21 PM
1class Solution { 
2    public int findCircleNum(int[][] isConnected) {
3        int n = isConnected.length;
4        int m = isConnected[0].length;
5        boolean[] visited = new boolean[n];
6        int provinces = 0;
7
8        for (int i = 0; i < n; i++) {
9            if (!visited[i]) {
10                dfs(i, isConnected, visited);
11                provinces++;
12            }
13        }
14
15        return provinces;
16    }
17
18    private void dfs(int i, int[][] isConnected, boolean[] visited) {
19        visited[i] = true;
20
21        for (int j = 0; j < isConnected.length; j++) {
22            if (isConnected[i][j] == 1 && !visited[j]) {
23                dfs(j, isConnected, visited);
24            }
25        }
26    }
27}
28
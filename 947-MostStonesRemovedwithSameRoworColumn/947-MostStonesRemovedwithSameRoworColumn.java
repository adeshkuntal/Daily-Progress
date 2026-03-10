// Last updated: 3/10/2026, 11:46:00 AM
1class Solution {
2    public int removeStones(int[][] stones) {
3        int n = stones.length;
4        boolean[] vis = new boolean[n];
5        int comp = 0;
6
7        for(int i = 0; i < n; i++){
8            if(!vis[i]){
9                dfs(i, stones, vis);
10                comp++;
11            }
12        }
13
14        return n - comp;
15    }
16
17    void dfs(int i, int[][] stones, boolean[] vis){
18        vis[i] = true;
19
20        for(int j = 0; j < stones.length; j++){
21            if(!vis[j] && (stones[i][0] == stones[j][0] || stones[i][1] == stones[j][1])){
22                dfs(j, stones, vis);
23            }
24        }
25    }
26}
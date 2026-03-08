// Last updated: 3/8/2026, 1:00:38 PM
1class Solution {
2    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
3        int[] dist = new int[n];
4        Arrays.fill(dist, Integer.MAX_VALUE);
5        dist[src] = 0;
6
7        for(int i = 0; i <= k; i++){
8            int[] temp = dist.clone();
9
10            for(int[] f : flights){
11                int u = f[0];
12                int v = f[1];
13                int wt = f[2];
14
15                if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < temp[v]){
16                    temp[v] = dist[u] + wt;
17                }
18            }
19
20            dist = temp;
21        }
22
23        return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
24    }
25}
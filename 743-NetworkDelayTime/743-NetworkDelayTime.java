// Last updated: 3/8/2026, 2:52:58 PM
1class Solution {
2    public int networkDelayTime(int[][] grid, int n, int k) {
3        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
4        for(int i = 0; i <= n; i++){
5            adj.add(new ArrayList<>());
6        }
7
8        for(int[] t : grid){
9            adj.get(t[0]).add(new int[]{t[1], t[2]});
10        }
11
12        int[] dist = new int[n+1];
13        Arrays.fill(dist, Integer.MAX_VALUE);
14
15        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
16        pq.add(new int[]{k,0});
17        dist[k] = 0;
18
19        while(!pq.isEmpty()){
20            int[] cur = pq.poll();
21            int node = cur[0];
22            int cost = cur[1];
23
24            for(int[] edge : adj.get(node)){
25                int v = edge[0];
26                int wt = edge[1];
27
28                if(cost + wt < dist[v]){
29                    dist[v] = cost + wt;
30                    pq.add(new int[]{v, dist[v]});
31                }
32            }
33        }
34
35        int ans = 0;
36        for(int i = 1; i <= n; i++){
37            if(dist[i] == Integer.MAX_VALUE) return -1;
38            ans = Math.max(ans, dist[i]);
39        }
40
41        return ans;
42    }
43}
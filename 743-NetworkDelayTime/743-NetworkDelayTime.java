// Last updated: 12/31/2025, 3:36:29 PM
1class Solution {
2    public int networkDelayTime(int[][] times, int n, int k) {
3
4        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
5        for(int i = 0; i <= n; i++){
6            adj.add(new ArrayList<>());
7        }
8
9        for(int[] t : times){
10            adj.get(t[0]).add(new int[]{t[1], t[2]});
11        }
12
13        int[] dist = new int[n + 1];
14        Arrays.fill(dist, Integer.MAX_VALUE);
15        dist[k] = 0;
16
17        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
18        pq.add(new int[]{k, 0});
19
20        while(!pq.isEmpty()){
21            int[] cur = pq.poll();
22            int u = cur[0];
23            int d = cur[1];
24
25            if(d > dist[u]) continue;
26
27            for(int[] edge : adj.get(u)){
28                int v = edge[0];
29                int wt = edge[1];
30
31                if(dist[u] + wt < dist[v]){
32                    dist[v] = dist[u] + wt;
33                    pq.add(new int[]{v, dist[v]});
34                }
35            }
36        }
37
38        int ans = 0;
39        for(int i = 1; i <= n; i++){
40            if(dist[i] == Integer.MAX_VALUE) return -1;
41            ans = Math.max(ans, dist[i]);
42        }
43
44        return ans;
45    }
46}
47
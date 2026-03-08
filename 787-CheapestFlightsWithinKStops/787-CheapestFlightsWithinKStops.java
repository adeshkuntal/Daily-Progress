// Last updated: 3/8/2026, 1:02:17 PM
1// class Solution {
2//     public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
3//         int[] dist = new int[n];
4//         Arrays.fill(dist, Integer.MAX_VALUE);
5//         dist[src] = 0;
6
7//         for(int i = 0; i <= k; i++){
8//             int[] temp = dist.clone();
9
10//             for(int[] f : flights){
11//                 int u = f[0];
12//                 int v = f[1];
13//                 int wt = f[2];
14
15//                 if(dist[u] != Integer.MAX_VALUE && dist[u] + wt < temp[v]){
16//                     temp[v] = dist[u] + wt;
17//                 }
18//             }
19
20//             dist = temp;
21//         }
22
23//         return dist[dst] == Integer.MAX_VALUE ? -1 : dist[dst];
24//     }
25// }
26
27
28
29
30
31class Solution {
32    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
33        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
34        for(int i = 0; i < n; i++){
35            adj.add(new ArrayList<>());
36        }
37
38        for(int[] t : flights){
39            adj.get(t[0]).add(new int[]{t[1], t[2]});
40        }
41
42        Queue<int[]> q = new LinkedList<>();
43        q.add(new int[]{src, 0});
44
45        int[] minCost = new int[n];
46        Arrays.fill(minCost, Integer.MAX_VALUE);
47        minCost[src] = 0;
48
49        int stops = 0;
50
51        while(!q.isEmpty() && stops <= k){
52            int size = q.size();
53
54            while(size-- > 0){
55                int[] cur = q.poll();
56                int node = cur[0];
57                int cost = cur[1];
58
59                for(int[] edge : adj.get(node)){
60                    int v = edge[0];
61                    int wt = edge[1];
62
63                    if(cost + wt >= minCost[v]) continue;
64
65                    minCost[v] = cost + wt;
66                    q.add(new int[]{v, minCost[v]});
67                }
68            }
69
70            stops++;
71        }
72
73        return minCost[dst] == Integer.MAX_VALUE ? -1 : minCost[dst];
74    }
75}
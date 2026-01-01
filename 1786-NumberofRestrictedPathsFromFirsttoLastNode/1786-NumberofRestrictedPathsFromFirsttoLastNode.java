// Last updated: 1/1/2026, 12:07:42 PM
1class Pair {
2    int node, weight;
3    Pair(int node, int weight) {
4        this.node = node;
5        this.weight = weight;
6    }
7}
8
9class Solution {
10    public int countRestrictedPaths(int n, int[][] edges) {
11        List<List<Pair>> adj = new ArrayList<>();
12        for (int i = 0; i <= n; i++) {
13            adj.add(new ArrayList<>());
14        }
15
16        for (int[] edge : edges) {
17            int u = edge[0];
18            int v = edge[1];
19            int w = edge[2];
20            adj.get(u).add(new Pair(v, w));
21            adj.get(v).add(new Pair(u, w));
22        }
23
24        int[] dist = new int[n + 1];
25        int[] ans = new int[n + 1];
26
27        Arrays.fill(dist, Integer.MAX_VALUE);
28        dist[n] = 0;
29        ans[n] = 1;
30
31        PriorityQueue<Pair> heap = new PriorityQueue<>((a, b) -> a.weight - b.weight);
32        heap.offer(new Pair(n, 0));
33        int mod = (int) 1e9 + 7;
34
35        while (!heap.isEmpty()) {
36            Pair top = heap.poll();
37            int d = top.weight, x = top.node;
38
39            if (d > dist[x]) continue;
40            if (x == 1) break;
41            
42            for (Pair neighbor : adj.get(x)) {
43                int y = neighbor.node, w = neighbor.weight;
44                if (dist[y] > dist[x] + w) {
45                    dist[y] = dist[x] + w;
46                    heap.offer(new Pair(y, dist[y]));
47                }
48                if (dist[y] > dist[x]) {
49                    ans[y] = (ans[y] + ans[x]) % mod;
50                }
51            }
52        }
53        return ans[1];
54    }
55}
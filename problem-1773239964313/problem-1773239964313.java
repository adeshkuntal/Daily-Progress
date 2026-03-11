// Last updated: 3/11/2026, 8:09:24 PM
1class Solution {
2    private int timer = 0;
3    private List<List<Integer>> bridges = new ArrayList<>();
4    private int[] disc, low;
5    private List<List<Integer>> graph;
6    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
7        disc = new int[n];
8        low  = new int[n];
9        Arrays.fill(disc, -1);
10        graph = new ArrayList<>();
11
12        for (int i = 0; i < n; i++){
13            graph.add(new ArrayList<>());
14        }
15        for (List<Integer> conn : connections) {
16            int u = conn.get(0), v = conn.get(1);
17            graph.get(u).add(v);
18            graph.get(v).add(u);
19        }
20
21        dfs(0, -1);
22        return bridges;
23    }
24    public void dfs(int u, int parent) {
25        disc[u] = low[u] = timer++;
26
27        for (int v : graph.get(u)) {
28            if (v == parent) continue;        // skip edge we came from
29
30            if (disc[v] == -1) {             // unvisited → tree edge
31                dfs(v, u);
32                low[u] = Math.min(low[u], low[v]);
33
34                if (low[v] > disc[u])        // bridge condition
35                    bridges.add(Arrays.asList(u, v));
36
37            } else {                         // visited → back edge
38                low[u] = Math.min(low[u], disc[v]);
39            }
40        }
41    }
42}
// Last updated: 1/1/2026, 11:18:41 AM
1class Solution {
2    public int findCenter(int[][] edges) {
3        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
4        int n = edges.length + 1;
5
6        for (int i = 1; i <= n; i++) {
7            map.put(i, new ArrayList<>());
8        }
9
10        for (int i = 0; i < edges.length; i++) {
11            map.get(edges[i][0]).add(edges[i][1]);
12            map.get(edges[i][1]).add(edges[i][0]);
13        }
14
15        boolean[] vis = new boolean[n + 1];
16        return findCenter(1, map, edges, vis);
17    }
18
19    public static int findCenter(int node, HashMap<Integer, ArrayList<Integer>> map, int[][] edges, boolean[] vis) {
20        if (vis[node]){
21            return 0;
22        }
23        vis[node] = true;
24
25        if (map.get(node).size() == edges.length) {
26            return node;
27        }
28
29        for (int x : map.get(node)) {
30            int ans = findCenter(x, map, edges, vis);
31            if (ans != 0){
32                return ans;
33            }
34        }
35
36        return 0;
37    }
38}
39
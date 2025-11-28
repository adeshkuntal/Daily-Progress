// Last updated: 11/28/2025, 6:28:14 PM
1class Solution {
2
3    List<List<Integer>> adj;
4    int[] values;
5    int k;
6    int ans;
7
8    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
9        this.values = values;
10        this.k = k;
11        this.ans = 0;
12
13        adj = new ArrayList<>();
14        for (int i = 0; i < n; i++) adj.add(new ArrayList<>());
15
16        for (int[] e : edges) {
17            int u = e[0], v = e[1];
18            adj.get(u).add(v);
19            adj.get(v).add(u);
20        }
21
22        dfs(0, -1);
23        return ans;
24    }
25
26    private long dfs(int u, int parent) {
27        long sum = values[u] % k;
28
29        for (int v : adj.get(u)) {
30            if (v == parent) continue;
31            sum = (sum + dfs(v, u)) % k;
32        }
33
34        if (sum % k == 0) {
35            ans++;
36            return 0;
37        }
38        return sum;
39    }
40}
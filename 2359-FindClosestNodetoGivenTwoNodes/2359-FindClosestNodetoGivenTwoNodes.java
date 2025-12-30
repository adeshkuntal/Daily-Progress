// Last updated: 12/30/2025, 10:16:07 PM
1import java.util.*;
2
3class Solution {
4    public int closestMeetingNode(int[] edges, int node1, int node2) {
5        int n = edges.length;
6
7        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
8        for(int i = 0; i < n; i++){
9            adj.add(new ArrayList<>());
10        }
11
12        for(int i = 0; i < n; i++){
13            if(edges[i] != -1){
14                adj.get(i).add(edges[i]);
15            }
16        }
17
18        int[] dist1 = new int[n];
19        int[] dist2 = new int[n];
20        Arrays.fill(dist1, -1);
21        Arrays.fill(dist2, -1);
22
23        dfs(node1, adj, dist1, 0);
24        dfs(node2, adj, dist2, 0);
25
26        int ans = -1;
27        int minMax = Integer.MAX_VALUE;
28
29        for(int i = 0; i < n; i++){
30            if(dist1[i] != -1 && dist2[i] != -1){
31                int maxDist = Math.max(dist1[i], dist2[i]);
32                if(maxDist < minMax){
33                    minMax = maxDist;
34                    ans = i;
35                }
36            }
37        }
38
39        return ans;
40    }
41
42    private void dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] dist, int d){
43        if(node == -1 || dist[node] != -1){
44            return;
45        }
46
47        dist[node] = d;
48
49        for(int next : adj.get(node)){
50            dfs(next, adj, dist, d + 1);
51        }
52    }
53}
54
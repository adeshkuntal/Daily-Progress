// Last updated: 1/2/2026, 8:47:26 PM
1class Solution {
2    public int[] minimumTime(int n, int[][] edges, int[] disappear) {
3        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
4        for(int i = 0; i < n; i++){
5            adj.add(new ArrayList<>());
6        }
7
8        for(int i = 0; i < edges.length; i++){
9            int u = edges[i][0];
10            int v = edges[i][1];
11            int w = edges[i][2];
12
13            adj.get(u).add(new int[]{v, w});
14            adj.get(v).add(new int[]{u, w});
15        }
16
17        int[] ans = new int[n];
18        Arrays.fill(ans, -1);
19
20        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> a[1] - b[1]);
21        pq.add(new int[]{0, 0});
22
23        if(0 < disappear[0]) ans[0] = 0;
24
25        while(!pq.isEmpty()){
26            int[] cur = pq.poll();
27            int node = cur[0];
28            int time = cur[1];
29
30            if(ans[node] != -1 && time > ans[node]){
31                continue;
32            }
33            
34            for(int[] x : adj.get(node)){
35                int next = x[0];
36                int wt = x[1];
37                int newTime = time + wt;
38
39                if(newTime < disappear[next]){
40                    if(ans[next] == -1 || newTime < ans[next]){
41                        ans[next] = newTime;
42                        pq.add(new int[]{next, newTime});
43                    }
44                }
45            }
46        }
47
48        return ans;
49    }
50}
51
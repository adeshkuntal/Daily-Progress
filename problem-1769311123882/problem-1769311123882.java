// Last updated: 1/25/2026, 8:48:43 AM
1class Solution {
2    public int specialNodes(int n, int[][] edges, int x, int y, int z) {
3        int[][] com = edges;
4        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
5        for(int i=0; i<n; i++){
6            graph.add(new ArrayList<>());
7        }
8        for(int i=0; i<com.length; i++){
9            int u = com[i][0];
10            int v = com[i][1];
11            graph.get(u).add(v);
12            graph.get(v).add(u);
13        }
14
15        int[] dx = bfs(n,graph,x);
16        int[] dy = bfs(n,graph,y);
17        int[] dz = bfs(n,graph,z);
18
19        int ans = 0;
20
21        for(int i=0; i<n; i++){
22            int a = dx[i];
23            int b = dy[i];
24            int c = dz[i];
25
26            if(a > b){
27                int t = a;
28                a = b;
29                b = t;
30            }
31            if(b > c){
32                int t = b;
33                b = c;
34                c = t;
35            }
36
37            if(a*a + b*b == c*c){
38                ans++;
39            }
40        }
41
42        return ans;
43    }
44
45    private int[] bfs(int n, ArrayList<ArrayList<Integer>> graph, int start){
46        int[] dist = new int[n];
47        Arrays.fill(dist,-1);
48
49        Queue<Integer> q = new LinkedList<>();
50        q.add(start);
51        dist[start] = 0;
52
53        while(!q.isEmpty()){
54            int u = q.poll();
55            for(int v : graph.get(u)){
56                if(dist[v] == -1){
57                    dist[v] = dist[u]+1;
58                    q.add(v);
59                }
60            }
61        }
62
63        return dist;
64    }
65}
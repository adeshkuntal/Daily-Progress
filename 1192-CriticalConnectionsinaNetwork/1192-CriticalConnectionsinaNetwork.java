// Last updated: 3/12/2026, 6:55:47 PM
1class Solution {
2    int timer = 0;
3    int[] disc,low;
4    List<List<Integer>> res = new ArrayList<>();
5    HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
6    public List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
7        disc = new int[n];
8        low = new int[n];
9        Arrays.fill(disc,-1);
10
11        for(int i=0; i<n; i++){
12            map.put(i,new ArrayList<>());
13        }
14        for (List<Integer> conn : connections) {
15            int u = conn.get(0);
16            int v = conn.get(1);
17            map.get(u).add(v);
18            map.get(v).add(u);
19        }
20
21        dfs(0,-1); // node,parent
22
23        return res;
24
25    }
26    public void dfs(int u,int parent){
27        disc[u]=low[u]=timer++;
28        for(int nbrs : map.get(u)){
29            if(nbrs == parent) continue;
30            if(disc[nbrs] == -1){
31                dfs(nbrs,u);
32                low[u] = Math.min(low[u],low[nbrs]);
33                if(low[nbrs] > disc[u]){
34                    res.add(Arrays.asList(u,nbrs));
35                }
36            }
37            else{
38                low[u] = Math.min(low[u],disc[nbrs]);
39            }
40        }
41    }
42}
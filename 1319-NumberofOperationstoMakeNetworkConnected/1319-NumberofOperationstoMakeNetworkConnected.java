// Last updated: 3/9/2026, 7:37:05 PM
1class Solution {
2    public int makeConnected(int n, int[][] connections) {
3        if(connections.length < n-1) return -1;
4
5        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
6        for(int i=0;i<n;i++){
7            adj.add(new ArrayList<>());
8        }
9
10        for(int[] e:connections){
11            adj.get(e[0]).add(e[1]);
12            adj.get(e[1]).add(e[0]);
13        }
14
15        boolean[] vis = new boolean[n];
16        int comp = 0;
17
18        for(int i=0;i<n;i++){
19            if(!vis[i]){
20                dfs(i,adj,vis);
21                comp++;
22            }
23        }
24
25        return comp-1;
26    }
27
28    void dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean[] vis){
29        vis[node]=true;
30
31        for(int it:adj.get(node)){
32            if(!vis[it]){
33                dfs(it,adj,vis);
34            }
35        }
36    }
37}
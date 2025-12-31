// Last updated: 12/31/2025, 12:23:26 PM
1class Solution {
2    public boolean canFinish(int V, int[][] edges) {
3        int[] indegree = new int[V];
4        for(int i = 0; i < edges.length; i++){
5            indegree[edges[i][1]]++; 
6        }
7        
8        Queue<Integer> q = new LinkedList<>();
9        ArrayList<Integer> ans = new ArrayList<>();
10        
11        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
12        for(int i = 0; i < V; i++){
13            map.put(i, new ArrayList<>());
14        }
15        for(int i = 0; i < edges.length; i++){
16            map.get(edges[i][0]).add(edges[i][1]);
17        }
18
19        for(int i = 0; i < V; i++){
20            if(indegree[i] == 0){
21                q.add(i);
22            }
23        }
24        
25        while(!q.isEmpty()){
26            int cur = q.poll();
27            ans.add(cur);
28
29            if(map.get(cur) != null){
30                for(int x : map.get(cur)){
31                    indegree[x]--;
32                    if(indegree[x] == 0){
33                        q.add(x);
34                    }
35                }
36            }
37        }
38
39        return ans.size() == V;
40    }
41}
42
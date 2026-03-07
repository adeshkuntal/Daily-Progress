// Last updated: 3/7/2026, 12:49:40 PM
1class Solution {
2    public int[] findOrder(int V, int[][] edges) {
3        int[] indegree = new int[V];
4        for(int i = 0; i < edges.length; i++){
5            indegree[edges[i][0]]++; 
6        }
7        
8        Queue<Integer> q = new LinkedList<>();
9        ArrayList<Integer> ans = new ArrayList<>();
10        
11        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
12        for(int i = 0; i < V; i++){
13            map.put(i, new ArrayList<>());
14        }
15
16        for(int i = 0; i < edges.length; i++){
17            map.get(edges[i][1]).add(edges[i][0]);
18        }
19
20        for(int i = 0; i < V; i++){
21            if(indegree[i] == 0){
22                q.add(i);
23            }
24        }
25        
26        while(!q.isEmpty()){
27            int cur = q.poll();
28            ans.add(cur);
29
30            for(int x : map.get(cur)){
31                indegree[x]--;
32                if(indegree[x] == 0){
33                    q.add(x);
34                }
35            }
36        }
37
38        if(ans.size() != V){
39            return new int[0];
40        }
41
42        int[] result = new int[ans.size()];
43        for(int i = 0; i < ans.size(); i++){
44            result[i] = ans.get(i);
45        }
46        return result;
47    }
48}
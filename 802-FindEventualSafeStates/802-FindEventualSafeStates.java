// Last updated: 3/7/2026, 1:30:20 PM
1class Solution {
2    public List<Integer> eventualSafeNodes(int[][] graph) {
3        int n = graph.length;
4
5        List<List<Integer>> rev = new ArrayList<>();
6        for(int i=0;i<n;i++) rev.add(new ArrayList<>());
7
8        int[] out = new int[n];
9
10        for(int i=0;i<n;i++){
11            out[i] = graph[i].length;
12            for(int v : graph[i]){
13                rev.get(v).add(i);
14            }
15        }
16
17        Queue<Integer> q = new LinkedList<>();
18        for(int i=0;i<n;i++){
19            if(out[i]==0) q.add(i);
20        }
21
22        List<Integer> res = new ArrayList<>();
23
24        while(!q.isEmpty()){
25            int node = q.poll();
26            res.add(node);
27
28            for(int prev : rev.get(node)){
29                out[prev]--;
30                if(out[prev]==0) q.add(prev);
31            }
32        }
33
34        Collections.sort(res);
35        return res;
36    }
37}
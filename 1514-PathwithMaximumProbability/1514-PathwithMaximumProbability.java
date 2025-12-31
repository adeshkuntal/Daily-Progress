// Last updated: 12/31/2025, 9:24:51 PM
1class Solution {
2    public double maxProbability(int n, int[][] edges, double[] prob, int start, int end) {
3        ArrayList<ArrayList<double[]>> adj = new ArrayList<>();
4        for(int i = 0; i < n; i++){
5            adj.add(new ArrayList<>());
6        }
7
8        for(int i = 0; i < edges.length; i++){
9            adj.get(edges[i][0]).add(new double[]{edges[i][1], prob[i]});
10            adj.get(edges[i][1]).add(new double[]{edges[i][0], prob[i]});
11        }
12
13        double[] dist = new double[n];
14        dist[start] = 1.0;
15
16        PriorityQueue<double[]> pq =
17            new PriorityQueue<>((a,b) -> Double.compare(b[1], a[1]));
18
19        pq.add(new double[]{start, 1.0});
20
21        while(!pq.isEmpty()){
22            double[] cur = pq.poll();
23            int node = (int) cur[0];
24            double p = cur[1];
25
26            if(node == end) return p;
27            if(p < dist[node]) continue;
28
29            for(double[] x : adj.get(node)){
30                int next = (int) x[0];
31                double newProb = p * x[1];
32
33                if(newProb > dist[next]){
34                    dist[next] = newProb;
35                    pq.add(new double[]{next, newProb});
36                }
37            }
38        }
39
40        return 0.0;
41    }
42}
43
// Last updated: 1/4/2026, 7:55:31 PM
1class Solution {
2    public int countPaths(int n, int[][] roads) {
3        int mod = 1000000007;
4
5        ArrayList<ArrayList<int[]>> map = new ArrayList<>();
6        for(int i = 0; i < n; i++){
7            map.add(new ArrayList<>());
8        }
9
10        for(int i = 0; i < roads.length; i++){
11            map.get(roads[i][0]).add(new int[]{roads[i][1], roads[i][2]});
12            map.get(roads[i][1]).add(new int[]{roads[i][0], roads[i][2]});
13        }
14
15        long[] dist = new long[n];
16        Arrays.fill(dist, Long.MAX_VALUE);
17        dist[0] = 0;
18
19        int[] ways = new int[n];
20        ways[0] = 1;
21
22        PriorityQueue<long[]> pq =
23                new PriorityQueue<>((a, b) -> Long.compare(a[1], b[1]));
24        pq.add(new long[]{0, 0});
25
26        while(!pq.isEmpty()){
27            long[] curr = pq.poll();
28            int node = (int) curr[0];
29            long time = curr[1];
30
31            if(time > dist[node]){
32                continue;
33            }
34
35            for(int[] x : map.get(node)){
36                int next = x[0];
37                long newTime = time + x[1];
38
39                if(newTime < dist[next]){
40                    dist[next] = newTime;
41                    ways[next] = ways[node];
42                    pq.add(new long[]{next, newTime});
43                } else if(newTime == dist[next]){
44                    ways[next] = (ways[next] + ways[node]) % mod;
45                }
46            }
47        }
48
49        return ways[n - 1];
50    }
51}
52
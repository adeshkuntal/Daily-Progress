// Last updated: 3/8/2026, 9:28:42 PM
1class Solution {
2    public int minCost(int maxTime, int[][] edge, int[] fees) {
3
4        int n = fees.length;
5
6        ArrayList<ArrayList<int[]>> map = new ArrayList<>();
7        for(int i = 0; i < n; i++){
8            map.add(new ArrayList<>());
9        }
10
11        for(int[] e : edge){
12            map.get(e[0]).add(new int[]{e[1], e[2]});
13            map.get(e[1]).add(new int[]{e[0], e[2]});
14        }
15
16        int[] minTime = new int[n];
17        Arrays.fill(minTime, Integer.MAX_VALUE);
18
19        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[2]-b[2]);
20        pq.add(new int[]{0,0,fees[0]});   // node,time,cost
21        minTime[0] = 0;
22
23        while(!pq.isEmpty()){
24
25            int[] curr = pq.poll();
26            int node = curr[0];
27            int time = curr[1];
28            int cost = curr[2];
29
30            if(node == n-1) return cost;
31
32            for(int[] nbr : map.get(node)){
33
34                int next = nbr[0];
35                int newTime = time + nbr[1];
36
37                if(newTime > maxTime) continue;
38
39                if(newTime < minTime[next]){
40                    minTime[next] = newTime;
41                    pq.add(new int[]{next,newTime,cost + fees[next]});
42                }
43            }
44        }
45
46        return -1;
47    }
48}
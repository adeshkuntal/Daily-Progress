// Last updated: 1/3/2026, 9:57:35 PM
1class Solution {
2    int[] bobTime;
3    boolean[] vis;
4    HashMap<Integer, ArrayList<Integer>> map;
5
6    public int mostProfitablePath(int[][] edges, int bob, int[] amount) {
7        int n = amount.length;
8        map = new HashMap<>();
9        for(int i = 0; i < n; i++){
10            map.put(i, new ArrayList<>());
11        }
12        for(int[] e : edges){
13            map.get(e[0]).add(e[1]);
14            map.get(e[1]).add(e[0]);
15        }
16
17        bobTime = new int[n];
18        Arrays.fill(bobTime, Integer.MAX_VALUE);
19        vis = new boolean[n];
20
21        findBobPath(bob, 0);
22
23        Arrays.fill(vis, false);
24        return dfsAlice(0, 0, 0, amount);
25    }
26
27    boolean findBobPath(int node, int time){
28        vis[node] = true;
29        bobTime[node] = time;
30
31        if(node == 0) return true;
32
33        for(int x : map.get(node)){
34            if(!vis[x]){
35                if(findBobPath(x, time + 1)) return true;
36            }
37        }
38        bobTime[node] = Integer.MAX_VALUE;
39        return false;
40    }
41
42    int dfsAlice(int node, int time, int income, int[] amount){
43        vis[node] = true;
44
45        if(time < bobTime[node]) income += amount[node];
46        else if(time == bobTime[node]) income += amount[node] / 2;
47
48        int max = Integer.MIN_VALUE;
49        boolean leaf = true;
50
51        for(int x : map.get(node)){
52            if(!vis[x]){
53                leaf = false;
54                max = Math.max(max, dfsAlice(x, time + 1, income, amount));
55            }
56        }
57
58        return leaf ? income : max;
59    }
60}
61
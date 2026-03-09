// Last updated: 3/9/2026, 7:35:14 PM
1class Solution {
2    public int makeConnected(int n, int[][] grid) {
3        int[] inner = new int[n];
4        int[] outer = new int[n];
5
6        for(int[] e : grid){
7            inner[e[1]]++;
8            outer[e[0]]++;
9        }
10
11        if(grid.length < n - 1){
12            return -1;
13        }
14
15        int[] parent = new int[n];
16        for(int i=0;i<n;i++){
17            parent[i] = i;
18        }
19
20        for(int[] e : grid){
21            int a = e[0];
22            int b = e[1];
23
24            while(parent[a] != a){
25                a = parent[a];
26            }
27
28            while(parent[b] != b){
29                b = parent[b];
30            }
31
32            if(a != b){
33                parent[a] = b;
34            }
35        }
36
37        int notConnect = 0;
38        for(int i=0;i<n;i++){
39            if(parent[i] == i){
40                notConnect++;
41            }
42        }
43
44        int freeCable = grid.length - (n - notConnect);
45
46        if(freeCable >= notConnect - 1){
47            return notConnect - 1;
48        }
49
50        return -1;
51    }
52}
// Last updated: 2/18/2026, 9:33:26 PM
1import java.util.*;
2
3class Solution {
4    public int maximumInvitations(int[] favorite) {
5        int n = favorite.length;
6        
7        int[] indegree = new int[n];
8        for(int i = 0; i < n; i++){
9            indegree[favorite[i]]++;
10        }
11        
12        Queue<Integer> q = new LinkedList<>();
13        int[] depth = new int[n];
14        
15        for(int i = 0; i < n; i++){
16            if(indegree[i] == 0){
17                q.add(i);
18            }
19        }
20        
21        while(!q.isEmpty()){
22            int curr = q.poll();
23            int next = favorite[curr];
24            
25            depth[next] = Math.max(depth[next], depth[curr] + 1);
26            
27            indegree[next]--;
28            if(indegree[next] == 0){
29                q.add(next);
30            }
31        }
32        
33        int maxCycle = 0;
34        int twoCycleSum = 0;
35        boolean[] visited = new boolean[n];
36        
37        for(int i = 0; i < n; i++){
38            if(indegree[i] > 0){
39                int cycleLength = 0;
40                int curr = i;
41                
42                while(!visited[curr]){
43                    visited[curr] = true;
44                    curr = favorite[curr];
45                    cycleLength++;
46                }
47                
48                if(cycleLength == 2){
49                    int a = i;
50                    int b = favorite[i];
51                    twoCycleSum += 2 + depth[a] + depth[b];
52                } else {
53                    maxCycle = Math.max(maxCycle, cycleLength);
54                }
55            }
56        }
57        
58        return Math.max(maxCycle, twoCycleSum);
59    }
60}
61
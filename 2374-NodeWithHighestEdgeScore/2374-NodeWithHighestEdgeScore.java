// Last updated: 1/2/2026, 9:23:19 PM
1class Solution {
2    public int edgeScore(int[] edges) {
3        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
4        for(int i=0; i<edges.length; i++){
5            map.put(i,new ArrayList<>());
6        }
7
8        for(int i=0; i<edges.length; i++){
9            map.get(edges[i]).add(i);
10        }
11
12        long[] indegree = new long[edges.length];
13        for(int i=0; i<edges.length; i++){
14            long sum = 0;
15            for(int x : map.get(i)){
16                sum += x;
17            }
18            indegree[i] = sum;
19        }
20
21        int ans = 0;
22        for(int i=1; i<edges.length; i++){
23            if(indegree[i] > indegree[ans]){
24                ans = i;
25            }
26        }
27
28        return ans;
29    }
30}
31
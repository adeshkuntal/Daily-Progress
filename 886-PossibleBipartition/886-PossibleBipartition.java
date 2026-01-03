// Last updated: 1/3/2026, 9:02:27 PM
1class Solution {
2    public boolean possibleBipartition(int n, int[][] dislikes) {
3        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
4        for(int i = 1; i <= n; i++){
5            map.put(i, new ArrayList<>());
6        }
7        for(int i = 0; i < dislikes.length; i++){
8            map.get(dislikes[i][0]).add(dislikes[i][1]);
9            map.get(dislikes[i][1]).add(dislikes[i][0]);
10        }
11
12        int[] color = new int[n + 1];
13
14        for(int i = 1; i <= n; i++){
15            if(color[i] == 0){
16                if(!findGroup(i, 1, color, map)){
17                    return false;
18                }
19            }
20        }
21        return true;
22    }
23
24    public boolean findGroup(int node, int c, int[] color, HashMap<Integer, ArrayList<Integer>> map){
25        color[node] = c;
26
27        for(int x : map.get(node)){
28            if(color[x] == c){
29                return false;
30            }
31            if(color[x] == 0){
32                if(!findGroup(x, -c, color, map)){
33                    return false;
34                }
35            }
36        }
37        return true;
38    }
39}
40
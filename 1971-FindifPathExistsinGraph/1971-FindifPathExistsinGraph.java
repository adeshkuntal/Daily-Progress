// Last updated: 12/31/2025, 8:49:38 PM
1class Solution {
2    public boolean validPath(int n, int[][] edges, int src, int des) {
3        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
4        for (int i = 0; i < n; i++) {
5            map.put(i, new ArrayList<>());
6        }
7
8        for (int i = 0; i < edges.length; i++) {
9            map.get(edges[i][0]).add(edges[i][1]);
10            map.get(edges[i][1]).add(edges[i][0]);
11        }
12
13        boolean[] vis = new boolean[n];
14        return validPath(src, des, map, vis);
15    }
16
17    public static boolean validPath(int src, int des,HashMap<Integer, ArrayList<Integer>> map, boolean[] vis) {
18        if (src == des) {
19            return true;
20        }
21
22        vis[src] = true;
23
24        for (int x : map.get(src)) {
25            if (!vis[x]) {
26                if (validPath(x, des, map, vis)) {
27                    return true;
28                }
29            }
30        }
31        return false;
32    }
33}
34
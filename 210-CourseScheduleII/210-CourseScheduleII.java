// Last updated: 12/31/2025, 12:25:23 PM
1class Solution {
2    public int[] findOrder(int n, int[][] prerequisites) {
3        List<Integer>[] adj = new List[n];
4        int[] indegree = new int[n];
5        List<Integer> ans = new ArrayList<>();
6
7        for (int[] pair : prerequisites) {
8            int course = pair[0];
9            int prerequisite = pair[1];
10            if (adj[prerequisite] == null) {
11                adj[prerequisite] = new ArrayList<>();
12            }
13            adj[prerequisite].add(course);
14            indegree[course]++;
15        }
16
17        Queue<Integer> queue = new LinkedList<>();
18        for (int i = 0; i < n; i++) {
19            if (indegree[i] == 0) {
20                queue.offer(i);
21            }
22        }
23
24        while (!queue.isEmpty()) {
25            int current = queue.poll();
26            ans.add(current);
27
28            if (adj[current] != null) {
29                for (int next : adj[current]) {
30                    indegree[next]--;
31                    if (indegree[next] == 0) {
32                        queue.offer(next);
33                    }
34                }
35            }
36        }
37        if(ans.size() != n) {
38            return new int[] {};
39        }
40
41        int[] result = new int[ans.size()];
42        for(int i = 0; i < ans.size(); i++) {
43            result[i] = ans.get(i);
44        }
45        return result;
46
47
48    }
49}
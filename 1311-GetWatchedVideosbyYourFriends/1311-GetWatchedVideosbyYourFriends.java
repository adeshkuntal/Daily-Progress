// Last updated: 1/1/2026, 8:51:47 PM
1class Solution {
2    public List<String> watchedVideosByFriends(List<List<String>> wv, int[][] friends, int id, int level) {
3        int n = friends.length;
4        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
5        for (int i = 0; i < n; i++) {
6            map.put(i, new ArrayList<>());
7        }
8
9        for (int i = 0; i < n; i++) {
10            for (int f : friends[i]) {
11                map.get(i).add(f);
12            }
13        }
14
15        boolean[] vis = new boolean[n];
16        Queue<Integer> q = new LinkedList<>();
17
18        q.add(id);
19        vis[id] = true;
20
21        int currLevel = 0;
22
23        while (!q.isEmpty() && currLevel < level) {
24            int size = q.size();
25            for (int i = 0; i < size; i++) {
26                int cur = q.poll();
27                for (int f : map.get(cur)) {
28                    if (!vis[f]) {
29                        vis[f] = true;
30                        q.add(f);
31                    }
32                }
33            }
34            currLevel++;
35        }
36
37        HashMap<String, Integer> freq = new HashMap<>();
38
39        while (!q.isEmpty()) {
40            int person = q.poll();
41            for (String v : wv.get(person)) {
42                freq.put(v, freq.getOrDefault(v, 0) + 1);
43            }
44        }
45
46        List<String> ans = new ArrayList<>(freq.keySet());
47
48        Collections.sort(ans, (a, b) -> {
49            if (freq.get(a).equals(freq.get(b))) {
50                return a.compareTo(b);
51            }
52            return freq.get(a) - freq.get(b);
53        });
54
55        return ans;
56    }
57}
58
// Last updated: 12/3/2025, 11:56:45 AM
1import java.util.*;
2
3class Solution {
4
5    static class Pair {
6        int a, b;
7        Pair(int a, int b) { this.a = a; this.b = b; }
8        public int hashCode() { return Objects.hash(a, b); }
9        public boolean equals(Object o) {
10            Pair p = (Pair)o;
11            return a == p.a && b == p.b;
12        }
13    }
14
15    public int countTrapezoids(int[][] points) {
16        int n = points.length;
17
18        Map<Pair, Map<Long, Integer>> slopes = new HashMap<>();
19        Map<String, Map<Pair, Integer>> mids = new HashMap<>();
20
21        for (int i = 0; i < n; i++) {
22            int x1 = points[i][0], y1 = points[i][1];
23            for (int j = i + 1; j < n; j++) {
24                int x2 = points[j][0], y2 = points[j][1];
25
26                int dx = x2 - x1, dy = y2 - y1;
27                int g = gcd(Math.abs(dx), Math.abs(dy));
28                dx /= g;
29                dy /= g;
30
31                if (dx < 0 || (dx == 0 && dy < 0)) {
32                    dx = -dx;
33                    dy = -dy;
34                }
35
36                Pair slope = new Pair(dy, dx);
37
38                long c = (long)dx * y1 - (long)dy * x1;
39
40                slopes.putIfAbsent(slope, new HashMap<>());
41                Map<Long, Integer> lineMap = slopes.get(slope);
42                lineMap.put(c, lineMap.getOrDefault(c, 0) + 1);
43
44                int mx = x1 + x2, my = y1 + y2;
45                String midKey = mx + "," + my;
46
47                mids.putIfAbsent(midKey, new HashMap<>());
48                Map<Pair, Integer> midMap = mids.get(midKey);
49                midMap.put(slope, midMap.getOrDefault(slope, 0) + 1);
50            }
51        }
52
53        long tot = 0;
54
55        for (Map<Long, Integer> lineCounts : slopes.values()) {
56            long total = 0;
57            long sumSq = 0;
58            for (int v : lineCounts.values()) {
59                total += v;
60                sumSq += (long)v * v;
61            }
62            tot += (total * total - sumSq) / 2;
63        }
64
65        long para = 0;
66
67        for (Map<Pair, Integer> sCnt : mids.values()) {
68            long v = 0;
69            long sumComb = 0;
70
71            for (int c : sCnt.values()) {
72                v += c;
73                sumComb += (long)c * (c - 1) / 2;
74            }
75            if (v > 1) {
76                para += v * (v - 1) / 2 - sumComb;
77            }
78        }
79
80        return (int)(tot - para);
81    }
82
83    private int gcd(int a, int b) {
84        while (b != 0) {
85            int t = a % b;
86            a = b;
87            b = t;
88        }
89        return a;
90    }
91}
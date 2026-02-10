// Last updated: 2/10/2026, 3:07:39 PM
1class Solution {
2    public int[] cycleLengthQueries(int n, int[][] queries) {
3        int m = queries.length;
4        int[] res = new int[m];
5        for (int i = 0; i < m; i++) {
6            res[i]++;
7            int x = queries[i][0], y = queries[i][1];
8            while (x != y) {
9                if (x > y)
10                    x /= 2;
11                else
12                    y /= 2;
13                res[i]++;
14            }
15        }
16        return res;
17    }
18}
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37    
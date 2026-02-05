// Last updated: 2/5/2026, 12:33:56 PM
1// class Solution {
2//     public List<String> findWords(char[][] board, String[] words) {
3//         int m = board.length;
4//         int n = board[0].length;
5//         List<String> ans = new ArrayList<>();
6
7//         for (String word : words) {
8//             boolean[][] vis = new boolean[m][n];
9//             boolean found = false;
10
11//             for (int i = 0; i < m && !found; i++) {
12//                 for (int j = 0; j < n && !found; j++) {
13//                     if (board[i][j] == word.charAt(0)) {
14//                         if (dfs(i, j, vis, board, m, n, word, 0)) {
15//                             ans.add(word);
16//                             found = true;
17//                         }
18//                     }
19//                 }
20//             }
21//         }
22//         return ans;
23//     }
24
25//     public boolean dfs(int i, int j, boolean[][] vis, char[][] grid, int m, int n, String word, int idx) {
26//         if (idx == word.length()) {
27//             return true;
28//         }
29//         if (i < 0 || j < 0 || i >= m || j >= n || vis[i][j] || grid[i][j] != word.charAt(idx)) {
30//             return false;
31//         }
32
33//         vis[i][j] = true;
34
35//         boolean found = dfs(i - 1, j, vis, grid, m, n, word, idx + 1) ||
36//                         dfs(i, j + 1, vis, grid, m, n, word, idx + 1) ||
37//                         dfs(i + 1, j, vis, grid, m, n, word, idx + 1) ||
38//                         dfs(i, j - 1, vis, grid, m, n, word, idx + 1);
39
40//         vis[i][j] = false;
41//         return found;
42//     }
43// }
44
45
46
47
48
49
50
51class Solution {
52    public List<String> findWords(char[][] board, String[] words) {
53
54        int m = board.length;
55        int n = board[0].length;
56        List<String> ans = new ArrayList<>();
57
58        int[] boardFreq = new int[26];
59        for (int i = 0; i < m; i++)
60            for (int j = 0; j < n; j++)
61                boardFreq[board[i][j] - 'a']++;
62
63        for (String w : words) {
64
65            int[] wordFreq = new int[26];
66            boolean skip = false;
67
68            for (char c : w.toCharArray()) {
69                if (++wordFreq[c - 'a'] > boardFreq[c - 'a']) {
70                    skip = true;
71                    break;
72                }
73            }
74            if (skip) continue;
75
76            String word = w;
77            if (boardFreq[word.charAt(0) - 'a'] > boardFreq[word.charAt(word.length() - 1) - 'a']) {
78                word = new StringBuilder(word).reverse().toString();
79            }
80
81            boolean[][] vis = new boolean[m][n];
82            boolean found = false;
83
84            for (int i = 0; i < m && !found; i++) {
85                for (int j = 0; j < n && !found; j++) {
86                    if (board[i][j] == word.charAt(0)) {
87                        if (dfs(i, j, vis, board, m, n, word, 0)) {
88                            ans.add(w);
89                            found = true;
90                        }
91                    }
92                }
93            }
94        }
95        return ans;
96    }
97
98    public boolean dfs(int i, int j, boolean[][] vis, char[][] grid, int m, int n, String word, int idx) {
99
100        if (idx == word.length()) return true;
101
102        if (i < 0 || j < 0 || i >= m || j >= n || vis[i][j] || grid[i][j] != word.charAt(idx))
103            return false;
104
105        vis[i][j] = true;
106
107        boolean found =
108                dfs(i - 1, j, vis, grid, m, n, word, idx + 1) ||
109                dfs(i, j + 1, vis, grid, m, n, word, idx + 1) ||
110                dfs(i + 1, j, vis, grid, m, n, word, idx + 1) ||
111                dfs(i, j - 1, vis, grid, m, n, word, idx + 1);
112
113        vis[i][j] = false;
114        return found;
115    }
116}
117
118
119
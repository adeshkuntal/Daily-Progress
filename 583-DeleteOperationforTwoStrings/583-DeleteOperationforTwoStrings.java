// Last updated: 12/21/2025, 3:17:13 PM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int m = word1.length(), n = word2.length();
4        int[][] dp = new int[m+1][n+1];
5
6        for (int i = 1; i <= m; i++) {
7            for (int j = 1; j <= n; j++) {
8                if (word1.charAt(i-1) == word2.charAt(j-1))
9                    dp[i][j] = 1 + dp[i-1][j-1];
10                else
11                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
12            }
13        }
14
15        int lcs = dp[m][n];
16        return (m - lcs) + (n - lcs);
17    }
18}
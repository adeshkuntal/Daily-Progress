// Last updated: 12/30/2025, 8:52:57 PM
1class Solution {
2    public int findJudge(int n, int[][] trust) {
3        if (n == 1 && trust.length == 0){
4            return 1;
5        }
6        int[] dp = new int[n+1];
7        for(int[] t : trust){
8            dp[t[0]]--;
9            dp[t[1]]++;
10        }
11        for(int i=1; i<=n; i++){
12            if(dp[i] == n-1){
13                return i;
14            }
15        }
16
17        return -1;
18    }
19}
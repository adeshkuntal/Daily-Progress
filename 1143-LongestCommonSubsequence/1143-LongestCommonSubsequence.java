// Last updated: 1/10/2026, 12:50:13 PM
1class Solution {
2    public int longestCommonSubsequence(String s1, String s2) {
3        int[][] dp = new int[s1.length()][s2.length()];
4        for(int[] a : dp){
5            Arrays.fill(a,-1);
6        }
7        return LCS(s1,s2,0,0,dp);
8    }
9    public static int LCS(String s1,String s2,int i,int j,int[][] dp){
10        if(i==s1.length() || j==s2.length()){
11            return 0;
12        }
13        if(dp[i][j] != -1){
14            return dp[i][j];
15        }
16        int ans = 0;
17        if(s1.charAt(i) == s2.charAt(j)){
18            ans = 1 + LCS(s1,s2,i+1,j+1,dp);
19        }
20        else{
21            int f = LCS(s1,s2,i+1,j,dp);
22            int s = LCS(s1,s2,i,j+1,dp);
23            ans = Math.max(f,s);
24        }
25        return dp[i][j] = ans;
26    }
27}
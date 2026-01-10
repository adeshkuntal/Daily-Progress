// Last updated: 1/10/2026, 9:28:40 PM
1class Solution {
2    public int numDistinct(String s, String t) {
3        int[][] dp = new int[s.length() + 1][t.length()];
4        for(int[] a : dp){
5            Arrays.fill(a,-1);
6        }
7        return DS(s,t,0,0,dp);
8    }
9    public static int DS(String s,String t,int i,int j,int[][] dp){
10        if(j == t.length()){
11            return 1;
12        }
13        if(i == s.length()){
14            return 0;
15        }
16        int inc = 0;
17        int exc = 0;
18        if(dp[i][j] != -1){
19            return dp[i][j];
20        }
21        if(s.charAt(i) == t.charAt(j)){
22            inc = DS(s,t,i+1,j+1,dp);
23        }
24        exc = DS(s,t,i+1,j,dp);
25
26        return dp[i][j] = inc + exc;
27
28    }
29}
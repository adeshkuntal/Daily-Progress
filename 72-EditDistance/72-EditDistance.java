// Last updated: 4/2/2026, 11:57:50 AM
1class Solution {
2    public int minDistance(String word1, String word2) {
3        int[][] dp = new int[word1.length()][word2.length()];
4        for(int[] x : dp){
5            Arrays.fill(x,-1);
6        }
7        return fn(word1,word2,0,0,dp);
8    }
9    public int fn(String word1, String word2,int i,int j,int[][] dp){
10        if(i == word1.length()){
11            return word2.length()-j;
12        }
13        if(j == word2.length()){
14            return word1.length()-i;
15        }
16        if(word1.charAt(i) == word2.charAt(j)){
17            return dp[i][j] = fn(word1,word2,i+1,j+1,dp);
18        }
19        if(dp[i][j] != -1){
20            return dp[i][j];
21        }
22        int in = 1 + fn(word1,word2,i,j+1,dp);
23        int d = 1 + fn(word1,word2,i+1,j,dp);
24        int r = 1 + fn(word1,word2,i+1,j+1,dp);
25
26        return dp[i][j] = Math.min(in,Math.min(d,r));
27    }
28}
29
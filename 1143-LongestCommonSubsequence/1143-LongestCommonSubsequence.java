// Last updated: 1/10/2026, 1:22:09 PM
1// class Solution {
2//     public int longestCommonSubsequence(String s1, String s2) {
3//         int[][] dp = new int[s1.length()][s2.length()];
4//         for(int[] a : dp){
5//             Arrays.fill(a,-1);
6//         }
7//         return LCS(s1,s2,0,0,dp);
8//     }
9//     public static int LCS(String s1,String s2,int i,int j,int[][] dp){
10//         if(i==s1.length() || j==s2.length()){
11//             return 0;
12//         }
13//         if(dp[i][j] != -1){
14//             return dp[i][j];
15//         }
16//         int ans = 0;
17//         if(s1.charAt(i) == s2.charAt(j)){
18//             ans = 1 + LCS(s1,s2,i+1,j+1,dp);
19//         }
20//         else{
21//             int f = LCS(s1,s2,i+1,j,dp);
22//             int s = LCS(s1,s2,i,j+1,dp);
23//             ans = Math.max(f,s);
24//         }
25//         return dp[i][j] = ans;
26//     }
27// }
28
29
30
31
32//Bottom UP
33class Solution {
34    public int longestCommonSubsequence(String s1, String s2) {
35        int[][] dp = new int[s1.length()+1][s2.length()+1];
36        for(int i=1; i<dp.length; i++){
37            for(int j=1; j<dp[0].length; j++){
38                if(s1.charAt(i-1) == s2.charAt(j-1)){
39                    dp[i][j] = 1 + dp[i-1][j-1];
40                }
41                else{
42                    int f = dp[i][j-1];
43                    int s = dp[i-1][j];
44                    dp[i][j] = Math.max(f,s);
45                }
46            }
47        }
48        return dp[dp.length-1][dp[0].length-1];
49    }
50}
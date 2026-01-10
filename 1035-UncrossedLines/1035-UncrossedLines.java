// Last updated: 1/10/2026, 3:38:12 PM
1class Solution {
2    public int maxUncrossedLines(int[] nums1, int[] nums2) {
3        int[][] dp = new int[nums1.length][nums2.length];
4        for(int[] a : dp){
5            Arrays.fill(a,-1);
6        }
7        return LCS(nums1,nums2,0,0,dp);
8    }
9    public static int LCS(int[] nums1, int[] nums2,int i,int j,int[][] dp){
10        if(i==nums1.length || j==nums2.length){
11            return 0;
12        }
13        if(dp[i][j] != -1){
14            return dp[i][j];
15        }
16        int ans = 0;
17        if(nums1[i] == nums2[j]){
18            ans = 1 + LCS(nums1,nums2,i+1,j+1,dp);
19        }
20        else{
21            int f = LCS(nums1,nums2,i+1,j,dp);
22            int s = LCS(nums1,nums2,i,j+1,dp);
23            ans = Math.max(f,s);
24        }
25        return dp[i][j] = ans;
26    }
27}
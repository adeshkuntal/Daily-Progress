// Last updated: 4/9/2026, 12:17:03 PM
1import java.util.*;
2
3class Solution {
4    public int jobScheduling(int[] st, int[] et, int[] profit) {
5        int n = st.length;
6        int[][] jobs = new int[n][3];
7        int[] dp = new int[n+1];
8        Arrays.fill(dp,-1);
9        for(int i = 0; i < n; i++){
10            jobs[i][0] = st[i];
11            jobs[i][1] = et[i];
12            jobs[i][2] = profit[i];
13        }
14        
15        Arrays.sort(jobs, (a,b) -> a[0] - b[0]);
16        
17        return fn(jobs, 0, dp);
18    }
19    
20    public int fn(int[][] jobs, int idx,int[] dp){
21        if(idx >= jobs.length) return 0;
22        
23        int next = idx + 1;
24        while(next < jobs.length && jobs[next][0] < jobs[idx][1]){
25            next++;
26        }
27        if(dp[idx] != -1){
28            return dp[idx];
29        }
30        
31        int pick = jobs[idx][2] + fn(jobs, next,dp);
32        int notPick = fn(jobs, idx + 1,dp);
33        
34        return dp[idx] = Math.max(pick, notPick);
35    }
36}
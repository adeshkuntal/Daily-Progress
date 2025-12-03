// Last updated: 12/3/2025, 1:48:51 PM
1class Solution {
2    public int mincostTickets(int[] days, int[] costs) {
3        int[] dp = new int[days.length];
4        Arrays.fill(dp,-1);
5        return findCost(days, costs, 0, dp);
6    }
7
8    public static int findCost(int[] days, int[] costs, int idx, int[] dp) {
9        if (idx >= days.length) {
10            return 0;
11        }
12        if (dp[idx] != -1){
13            return dp[idx];
14        }
15
16        int a = costs[0] + findCost(days, costs, idx + 1, dp);
17
18        int i = idx;
19        while (i < days.length && days[i] < days[idx] + 7){
20            i++;
21        }
22        int b = costs[1] + findCost(days, costs, i, dp);
23
24        int j = idx;
25        while (j < days.length && days[j] < days[idx] + 30){
26            j++;
27        }
28        int c = costs[2] + findCost(days, costs, j, dp);
29
30        return dp[idx] = Math.min(a, Math.min(b, c));
31    }
32}
33
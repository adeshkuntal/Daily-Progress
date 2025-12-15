// Last updated: 12/15/2025, 8:47:17 PM
1class Solution {
2    public long getDescentPeriods(int[] prices) {
3        long ans = 0;
4        int c = 1;
5
6        for (int i = 0; i < prices.length; i++) {
7            if (i == 0) {
8                ans += c;
9                continue;
10            }
11
12            if (prices[i] == prices[i - 1] - 1) {
13                c++;
14            } else {
15                c = 1;
16            }
17
18            ans += c;
19        }
20
21        return ans;
22    }
23}
// Last updated: 1/30/2026, 9:30:43 PM
1class Solution {
2    public boolean validPartition(int[] nums) {
3        int n = nums.length;
4        boolean[] dp = new boolean[n + 1];
5        dp[0] = true;
6
7        for (int i = 2; i <= n; i++) {
8            if (dp[i - 2] && nums[i - 1] == nums[i - 2]) {
9                dp[i] = true;
10            }
11
12            if (i >= 3) {
13                if (dp[i - 3] &&
14                    nums[i - 1] == nums[i - 2] &&
15                    nums[i - 2] == nums[i - 3]) {
16                    dp[i] = true;
17                }
18
19                if (dp[i - 3] &&
20                    nums[i - 3] + 1 == nums[i - 2] &&
21                    nums[i - 2] + 1 == nums[i - 1]) {
22                    dp[i] = true;
23                }
24            }
25        }
26
27        return dp[n];
28    }
29}
30
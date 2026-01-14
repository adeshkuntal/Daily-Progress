// Last updated: 1/14/2026, 2:57:49 PM
1class Solution {
2    public int maxOperations(int[] nums) {
3        int n = nums.length;
4        if (n < 2) return 0;
5
6        int[][] dp1 = new int[n][n];
7        int[][] dp2 = new int[n][n];
8        int[][] dp3 = new int[n][n];
9
10        for (int i = 0; i < n; i++) {
11            Arrays.fill(dp1[i], -1);
12            Arrays.fill(dp2[i], -1);
13            Arrays.fill(dp3[i], -1);
14        }
15
16        int a = solve(nums, 0, n - 1, nums[0] + nums[1], dp1);
17        int b = solve(nums, 0, n - 1, nums[n - 2] + nums[n - 1], dp2);
18        int c = solve(nums, 0, n - 1, nums[0] + nums[n - 1], dp3);
19
20        return Math.max(a, Math.max(b, c));
21    }
22
23    int solve(int[] nums, int l, int r, int sum, int[][] dp) {
24        if (l >= r){
25            return 0;
26        }
27        if (dp[l][r] != -1){
28            return dp[l][r];
29        }
30
31        int ans = 0;
32
33        if (nums[l] + nums[l + 1] == sum)
34            ans = Math.max(ans, 1 + solve(nums, l + 2, r, sum, dp));
35
36        if (nums[r - 1] + nums[r] == sum)
37            ans = Math.max(ans, 1 + solve(nums, l, r - 2, sum, dp));
38
39        if (nums[l] + nums[r] == sum)
40            ans = Math.max(ans, 1 + solve(nums, l + 1, r - 1, sum, dp));
41
42        return dp[l][r] = ans;
43    }
44}
45
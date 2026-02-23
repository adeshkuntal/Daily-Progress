// Last updated: 2/23/2026, 9:22:56 PM
1class Solution {
2    public boolean predictTheWinner(int[] nums) {
3        int n = nums.length;
4        int sum = 0;
5        for(int i = 0; i < n; i++) {
6            sum += nums[i];
7        }
8        int[][] dp = new int[n][n];
9        for(int[] d : dp) {
10            Arrays.fill(d, -1);
11        }
12        int player1 = Fn(0, n - 1, nums, dp);
13        int player2 = sum - player1;
14
15        return player1 >= player2;
16    }
17
18    public int Fn(int i, int j, int[] nums, int[][] dp) {
19        if(i > j) {
20            return 0;
21        }
22        if(i == j) {
23            return nums[i];
24        }
25        if(dp[i][j] != -1) {
26            return dp[i][j];
27        }
28
29        int a = nums[i] + Math.min(Fn(i + 2, j, nums, dp), Fn(i + 1, j - 1, nums, dp));
30        int b = nums[j] + Math.min(Fn(i, j - 2, nums, dp), Fn(i + 1, j - 1, nums, dp));
31
32        return dp[i][j] = Math.max(a, b);
33    }
34}
// Last updated: 10/7/2025, 10:55:44 AM
class Solution {
    public boolean predictTheWinner(int[] nums) {
        
        int n = nums.length;
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += nums[i];
        }
        int[][] dp = new int[n][n];
        for(int[] d : dp) {
            Arrays.fill(d, -1);
        }
        int player1 = Fn(0, n - 1, nums, dp);
        int player2 = sum - player1;

        return player1 >= player2;
    }

    public int Fn(int i, int j, int[] nums, int[][] dp) {
        if(i > j) {
            return 0;
        }
        if(i == j) {
            return nums[i];
        }
        if(dp[i][j] != -1) {
            return dp[i][j];
        }

        int a = nums[i] + Math.min(Fn(i + 2, j, nums, dp), Fn(i + 1, j - 1, nums, dp));
        int b = nums[j] + Math.min(Fn(i, j - 2, nums, dp), Fn(i + 1, j - 1, nums, dp));

        return dp[i][j] = Math.max(a, b);
    }
}
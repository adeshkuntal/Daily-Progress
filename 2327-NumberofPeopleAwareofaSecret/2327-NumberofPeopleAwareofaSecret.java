// Last updated: 9/9/2025, 8:50:54 PM
class Solution { 
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int MOD = (int) 1e9 + 7; 
        long[] dp = new long[n + 1]; 
        dp[1] = 1; 
        for (int i = 2; i <= n; i++) { 
            int start = Math.max(1, i - forget + 1); 
            int end = i - delay;
            for (int j = start; j <= end; j++) { 
                dp[i] = (dp[i] + dp[j]) % MOD;
            }
        }
        long result = 0; 
        int start = Math.max(1, n - forget + 1); 
        for (int i = start; i <= n; i++) { 
            result = (result + dp[i]) % MOD;
        }
        return (int) result;
    }
}
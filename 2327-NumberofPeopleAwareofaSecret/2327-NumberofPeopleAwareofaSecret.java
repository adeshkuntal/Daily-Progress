// Last updated: 9/9/2025, 8:48:47 PM
class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        int MOD = 1000000007;
        long[] dp = new long[n + 1];
        long[] prefix = new long[n + 2];
        dp[1] = 1;
        prefix[2] = 1;

        for (int day = 2; day <= n; day++) {
            int start = Math.max(0, day - forget);
            int end = Math.max(0, day - delay);
            long val = (prefix[end + 1] - prefix[start + 1] + MOD) % MOD;
            dp[day] = val;
            prefix[day + 1] = (prefix[day] + dp[day]) % MOD;
        }

        long ans = 0;
        for (int day = n - forget + 1; day <= n; day++) {
            if (day >= 1) ans = (ans + dp[day]) % MOD;
        }
        return (int) ans;
    }
}
// Last updated: 12/6/2025, 9:48:08 PM
1class Solution {
2    public int countPartitions(int[] nums, int k) {
3        final int MOD = 1_000_000_007;
4        int n = nums.length;
5
6        long[] dp = new long[n + 1];
7        long[] pref = new long[n + 1];
8
9        dp[0] = 1;
10        pref[0] = 1;
11
12        Deque<Integer> maxdq = new ArrayDeque<>();
13        Deque<Integer> mindq = new ArrayDeque<>();
14
15        int l = 0;
16
17        for (int r = 0; r < n; r++) {
18            int x = nums[r];
19
20            while (!maxdq.isEmpty() && nums[maxdq.peekLast()] <= x) {
21                maxdq.pollLast();
22            }
23            maxdq.offerLast(r);
24
25            while (!mindq.isEmpty() && nums[mindq.peekLast()] >= x) {
26                mindq.pollLast();
27            }
28            mindq.offerLast(r);
29
30            while (!maxdq.isEmpty() && !mindq.isEmpty()
31                    && (long)nums[maxdq.peekFirst()] - nums[mindq.peekFirst()] > k) {
32                if (maxdq.peekFirst() == l) maxdq.pollFirst();
33                if (mindq.peekFirst() == l) mindq.pollFirst();
34                l++;
35            }
36
37            int L = l;
38            int i = r + 1;
39
40            long ways = pref[i - 1];
41            if (L > 0) ways -= pref[L - 1];
42            ways %= MOD;
43            if (ways < 0) ways += MOD;
44
45            dp[i] = ways;
46            pref[i] = (pref[i - 1] + dp[i]) % MOD;
47        }
48
49        return (int)dp[n];
50    }
51}
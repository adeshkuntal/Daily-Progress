// Last updated: 1/22/2026, 12:17:10 PM
1class Solution {
2    private static final int MOD = 1000000007;
3
4    public int monkeyMove(int n) {
5        long res = 1;
6        long base = 2;
7
8        while (n > 0) {
9            if ((n & 1) == 1) res = (res * base) % MOD;
10            base = (base * base) % MOD;
11            n >>= 1;
12        }
13
14        return (int)((res - 2 + MOD) % MOD);
15    }
16}
17
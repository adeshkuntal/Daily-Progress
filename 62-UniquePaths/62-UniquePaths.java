// Last updated: 8/4/2025, 6:58:00 PM
class Solution {
    public int uniquePaths(int m, int n) {
        long res = 1;
        for (int i = 1; i <= m - 1; i++) {
            res = res * (n - 1 + i) / i;
        }
        return (int) res;
    }
}

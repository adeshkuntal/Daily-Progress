// Last updated: 10/4/2025, 9:26:50 PM
class Solution {
    public int uniquePaths(int m, int n) {
        long res = 1;
        for (int i = 1; i < m; i++) {
            res = res * (n - 1 + i) / i;
        }
        return (int) res;
    }
}

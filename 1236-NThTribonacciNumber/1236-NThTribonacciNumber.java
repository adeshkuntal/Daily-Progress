// Last updated: 8/4/2025, 6:51:47 PM
class Solution {
    public int tribonacci(int n) {
        return findTeri(n, 0, 1, 1);
    }

    public static int findTeri(int n, int t0, int t1, int t2) {
        if (n == 0) return t0;
        if (n == 1) return t1;
        if (n == 2) return t2;

        return findTeri(n - 1, t1, t2, t0 + t1 + t2);
    }
}
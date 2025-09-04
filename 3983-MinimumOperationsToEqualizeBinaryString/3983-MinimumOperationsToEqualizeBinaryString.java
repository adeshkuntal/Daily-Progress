// Last updated: 9/4/2025, 7:15:49 PM
class Solution {
    public int minOperations(String s, int k) {
        String drunepalix = s;
        int n = drunepalix.length();
        if (k == 0) return drunepalix.indexOf('0') == -1 ? 0 : -1;
        if (k > n) return -1;
        int zeros = 0;
        for (int i = 0; i < n; i++) if (drunepalix.charAt(i) == '0') zeros++;
        if (zeros == 0) return 0;
        if ((k % 2 == 0) && (zeros % 2 == 1)) return -1;
        int tStart = (zeros + k - 1) / k;
        int limit = tStart + 2 * n + 5;
        for (int t = tStart; t <= limit; t++) {
            long tk = 1L * t * k;
            long maxSum;
            if ((t & 1) == 0) maxSum = 1L * t * n - zeros;
            else maxSum = 1L * (t - 1) * n + zeros;
            if (tk < zeros) continue;
            if (tk > maxSum) continue;
            if (((tk - zeros) & 1L) != 0L) continue;
            return t;
        }
        return -1;
    }
}

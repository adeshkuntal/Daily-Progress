// Last updated: 9/9/2025, 3:37:28 PM
class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for (int k = 1; k <= 60; k++) {
            long target = (long) num1 - (long) num2 * k;
            if (target < k) continue;
            if (Long.bitCount(target) <= k && k <= target) {
                return k;
            }
        }
        return -1;
    }
}

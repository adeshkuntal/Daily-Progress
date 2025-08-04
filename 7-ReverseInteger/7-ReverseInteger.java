// Last updated: 8/4/2025, 6:58:54 PM
class Solution {
    public int reverse(int x) {
        long result = 0;
        boolean negative = x < 0;
        x = Math.abs(x);

        while (x != 0) {
            result = result * 10 + x % 10;
            x /= 10;
        }

        if (negative) {
            result = -result;
        }

        // Check for overflow
        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            return 0;
        }

        return (int) result;
    }
}
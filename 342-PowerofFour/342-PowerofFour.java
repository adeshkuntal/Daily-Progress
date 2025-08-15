// Last updated: 8/15/2025, 11:10:06 AM
class Solution {
    public boolean isPowerOfFour(int n) {
         if (n <= 0) {
            return false;
        }
        while (n % 4 == 0) {
            n /= 4;
        }
        return n == 1;
    }
}
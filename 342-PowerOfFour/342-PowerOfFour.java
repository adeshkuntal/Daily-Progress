// Last updated: 8/4/2025, 6:55:53 PM
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
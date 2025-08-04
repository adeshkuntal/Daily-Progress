// Last updated: 8/4/2025, 6:55:59 PM
class Solution {
    public boolean isPowerOfThree(int n) {
         if (n <= 0) {
            return false;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        return n == 1;

    }
}
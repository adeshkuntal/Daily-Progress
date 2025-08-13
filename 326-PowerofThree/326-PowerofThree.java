// Last updated: 8/13/2025, 7:27:38 PM
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
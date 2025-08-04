// Last updated: 8/4/2025, 6:55:43 PM
class Solution {
    public boolean isPerfectSquare(int num) {
        if (num < 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(num);
        return (sqrt * sqrt == num);
    }
}
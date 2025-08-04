// Last updated: 8/4/2025, 6:58:24 PM
class Solution {
    public int divide(int a, int b) {
        if (a == Integer.MIN_VALUE && b == -1) {
            return Integer.MAX_VALUE;
        } else {
            return a/b;
        }
        
    }
}
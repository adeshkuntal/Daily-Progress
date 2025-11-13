// Last updated: 11/13/2025, 9:16:36 PM
class Solution {
    public int maxOperations(String s) {
        int res = 0;
        int one = 0;
        int n = s.length();
        for (int i = 0; i < n; ++i) {
            one += s.charAt(i) - '0';
            if (i > 0 && s.charAt(i) < s.charAt(i - 1)) {
                res += one;
            }
        }
        return res;
    }
}
// Last updated: 11/22/2025, 1:17:21 PM
class Solution {
    public int maxOperations(String s) {
        int res = 0;
        int one = 0;
        for (int i = 0; i < s.length(); i++) {
            one += s.charAt(i) - '0';
            if (i > 0 && s.charAt(i) < s.charAt(i - 1)) {
                res += one;
            }
        }
        return res;
    }
}
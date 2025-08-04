// Last updated: 8/4/2025, 6:57:26 PM
class Solution {
    public boolean isPalindrome(String s) {
        String x = "";
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                x+=(Character.toLowerCase(c));
            }
        }
        String a = "";
        for (int i = x.length() - 1; i >= 0; i--) {
            a += x.charAt(i);
        }
        return a.equals(x);
    }
}
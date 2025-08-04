// Last updated: 8/4/2025, 6:58:51 PM
class Solution {
    public boolean isPalindrome(int x) {
        String a = "";
        String s = Integer.toString(x);
        for (int i = s.length() - 1; i >= 0; i--) {
            a += s.charAt(i);
        }
        return a.equals(s);
    }
}
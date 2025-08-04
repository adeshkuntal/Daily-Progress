// Last updated: 8/4/2025, 6:55:15 PM
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length(); for (int i = 1; i <= len / 2; i++) { if (len % i == 0) { String substring = s.substring(0, i); StringBuilder repeated = new StringBuilder(); for (int j = 0; j < len / i; j++) { repeated.append(substring); } if (repeated.toString().equals(s)) { return true; } } } return false;
    }
}
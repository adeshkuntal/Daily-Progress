// Last updated: 8/4/2025, 6:53:57 PM
class Solution {
    public int countBinarySubstrings(String s) {
        int count = 0; int prevCount = 0; int currCount = 1; for (int i = 1; i < s.length(); i++) { if (s.charAt(i) == s.charAt(i - 1)) { currCount++; } else { count += Math.min(prevCount, currCount); prevCount = currCount; currCount = 1; } } count += Math.min(prevCount, currCount); return count;
    }
}
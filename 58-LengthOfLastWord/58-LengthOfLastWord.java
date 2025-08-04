// Last updated: 8/4/2025, 6:58:04 PM
class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int lastSpaceIndex = s.lastIndexOf(' ');
        return s.length() - lastSpaceIndex - 1;
    }
}
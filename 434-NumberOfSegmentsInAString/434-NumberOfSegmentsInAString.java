// Last updated: 8/4/2025, 6:55:29 PM
class Solution {
    public int countSegments(String s) {
        String[] part = s.split(" ");
        int count = 0;
        for (String segment : part) {
            if (!segment.isEmpty()) {
                count++;
            }
        }
        return count;
    }
}
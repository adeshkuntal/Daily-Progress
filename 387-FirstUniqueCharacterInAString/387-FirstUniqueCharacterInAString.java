// Last updated: 8/4/2025, 6:55:36 PM
class Solution {
    public int firstUniqChar(String s) {
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && current == s.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return i;
            }
        }
        return -1;
    }
}
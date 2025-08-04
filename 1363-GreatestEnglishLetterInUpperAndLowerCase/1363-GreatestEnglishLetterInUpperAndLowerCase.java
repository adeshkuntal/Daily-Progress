// Last updated: 8/4/2025, 6:51:26 PM
class Solution {
    public String greatestLetter(String s) {
        boolean[] upper = new boolean[26];
        boolean[] lower = new boolean[26];

        for (char c : s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                lower[c - 'a'] = true;
            } else if (Character.isUpperCase(c)) {
                upper[c - 'A'] = true;
            }
        }

        for (int i = 25; i >= 0; i--) {
            if (upper[i] && lower[i]) {
                return Character.toString((char) (i + 'A'));
            }
        }

        return "";
    
    }
}
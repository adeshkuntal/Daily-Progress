// Last updated: 9/4/2025, 7:16:09 PM
class Solution {
    public String decodeMessage(String key, String message) {
        char[] map = new char[26];
        boolean[] seen = new boolean[26];
        int index = 0;

        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if (c != ' ' && !seen[c - 'a']) {
                map[c - 'a'] = (char) ('a' + index);
                seen[c - 'a'] = true;
                index++;
            }
        }

        StringBuilder decoded = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (c == ' ') {
                decoded.append(' ');
            } else {
                decoded.append(map[c - 'a']);
            }
        }

        return decoded.toString();
    }
}

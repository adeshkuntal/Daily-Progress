// Last updated: 8/4/2025, 6:53:01 PM
class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder a1 = new StringBuilder();
        StringBuilder a2 = new StringBuilder();

        // Process string s
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '#') {
                if (a1.length() > 0) {
                    a1.deleteCharAt(a1.length() - 1);
                }
            } else {
                a1.append(s.charAt(i));
            }
        }

        // Process string t
        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == '#') {
                if (a2.length() > 0) {
                    a2.deleteCharAt(a2.length() - 1);
                }
            } else {
                a2.append(t.charAt(i));
            }
        }
        return a1.toString().equals(a2.toString());
    }
}
// Last updated: 1/20/2026, 11:54:14 AM
1class Solution {
2    public int minLength(String s) {
3        StringBuilder st = new StringBuilder(s);
4
5        for (int i = 0; i < st.length() - 1; i++) {
6            if ((st.charAt(i) == 'A' && st.charAt(i + 1) == 'B') ||
7                (st.charAt(i) == 'C' && st.charAt(i + 1) == 'D')) {
8
9                st.delete(i, i + 2);
10                i = -1;
11            }
12        }
13        return st.length();
14    }
15}
16
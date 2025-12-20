// Last updated: 12/20/2025, 7:27:36 PM
1class Solution {
2    public boolean isLongPressedName(String name, String typed) {
3        int i = 0;
4        int m = name.length();
5
6        for (int j = 0; j < typed.length(); j++) {
7            if (i < m && name.charAt(i) == typed.charAt(j)) {
8                i++;
9            } else if (j == 0 || typed.charAt(j) != typed.charAt(j - 1) || typed.charAt(j) != name.charAt(i - 1)) {
10                return false;
11            }
12        }
13
14        return i == m;
15    }
16}
17
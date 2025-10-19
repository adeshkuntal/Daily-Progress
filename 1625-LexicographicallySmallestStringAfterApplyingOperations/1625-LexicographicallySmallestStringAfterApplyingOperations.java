// Last updated: 10/19/2025, 12:04:02 PM
import java.util.*;

class Solution {
    public String findLexSmallestString(String s, int a, int b) {
        Set<String> se = new HashSet<>();
        String[] res = new String[]{s}; 

        dfs(s, a, b, se, res);
        return res[0];
    }

    private void dfs(String s, int a, int b, Set<String> se, String[] res) {
        if (se.contains(s)) return;

        se.add(s);
        if (s.compareTo(res[0]) < 0) res[0] = s;

        int n = s.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                int newDigit = (s.charAt(i) - '0' + a) % 10;
                sb.append((char) ('0' + newDigit));
            } else {
                sb.append(s.charAt(i));
            }
        }

        dfs(sb.toString(), a, b, se, res);

        String rotated = s.substring(b) + s.substring(0, b);
        dfs(rotated, a, b, se, res);
    }
}

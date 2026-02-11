// Last updated: 2/11/2026, 7:35:06 PM
1class Solution {
2    public String longestPalindrome(String s) {
3        if (s.length() == 0) return "";
4
5        int maxLen = 0;
6        String ans = "";
7
8        for (int i = 0; i < s.length(); i++) {
9            for (int j = i; j < s.length(); j++) {
10                String sub = s.substring(i, j + 1);
11                if (isPalindrome(sub)) {
12                    if (j - i + 1 > maxLen) {
13                        ans = sub;
14                        maxLen = j - i + 1;
15                    }
16                }
17            }
18        }
19        return ans;
20    }
21
22    public boolean isPalindrome(String str) {
23        int l = 0;
24        int r = str.length() - 1;
25
26        while (l < r) {
27            if (str.charAt(l) != str.charAt(r)) {
28                return false;
29            }
30            l++;
31            r--;
32        }
33        return true;
34    }
35}
36
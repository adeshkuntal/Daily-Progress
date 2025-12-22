// Last updated: 12/22/2025, 11:58:42 AM
1class Solution {
2    public String longestNiceSubstring(String str) {
3        String ans = "";
4        
5        for (int i = 0; i < str.length(); i++) {
6            for (int j = i + 1; j <= str.length(); j++) {
7                String s = str.substring(i, j);
8                boolean l = true;
9                
10                for (int k = 0; k < s.length(); k++) {
11                    char ch = s.charAt(k);
12                    if (Character.isLowerCase(ch)) {
13                        if (!s.contains(Character.toString(Character.toUpperCase(ch)))) {
14                            l = false;
15                            break;
16                        }
17                    } else {
18                        if (!s.contains(Character.toString(Character.toLowerCase(ch)))) {
19                            l = false;
20                            break;
21                        }
22                    }
23                }
24                
25                if (l && s.length() > ans.length()) {
26                    ans = s;
27                }
28            }
29        }
30
31        return ans;
32
33
34    }
35}
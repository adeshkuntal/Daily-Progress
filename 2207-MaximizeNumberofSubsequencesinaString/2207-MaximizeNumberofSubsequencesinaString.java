// Last updated: 12/28/2025, 1:34:59 PM
1class Solution {
2    public long maximumSubsequenceCount(String text, String pattern) {
3        int n = text.length();
4        char A = pattern.charAt(0);
5        char B = pattern.charAt(1);
6
7        long a = 0, ab = 0, b = 0;
8        for(char ch : text.toCharArray()){
9            if(ch == A) {
10                a += 1;
11            }
12            if(ch == B) {
13                b += 1;
14                ab += a;
15            }
16        }
17        return A == B ? ab : ab + Math.max(a, b);
18    }
19}
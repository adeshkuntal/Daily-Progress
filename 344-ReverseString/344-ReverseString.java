// Last updated: 12/29/2025, 8:22:07 PM
1class Solution {
2    public void reverseString(char[] s) {
3        int l = 0;
4        int r = s.length - 1;
5        while(l < r){
6            char c = s[l];
7            s[l] = s[r];
8            s[r] = c;
9            l++;
10            r--;
11        }
12    }
13}
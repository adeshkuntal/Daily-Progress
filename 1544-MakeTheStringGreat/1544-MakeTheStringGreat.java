// Last updated: 2/26/2026, 9:36:14 PM
1class Solution {
2    public int strStr(String h, String n) {
3        int ans = -1;
4        if(h.contains(n)){
5            ans = h.indexOf(n);
6        }
7
8        return ans;
9    }
10}
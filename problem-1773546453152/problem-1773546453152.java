// Last updated: 3/15/2026, 9:17:33 AM
1class Solution {
2    public int countCommas(int n) {
3        if(n>= 1000){
4            return n-999;
5        }
6        return 0;
7    }
8}
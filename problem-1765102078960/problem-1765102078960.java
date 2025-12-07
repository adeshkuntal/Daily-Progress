// Last updated: 12/7/2025, 3:37:58 PM
1class Solution {
2    public int countOdds(int low, int high) {
3        if (low % 2 == 0 && high % 2 == 0) {
4            return (high - low) / 2;
5        } else {
6            return (high - low) / 2 + 1;
7        }
8    }
9}
10
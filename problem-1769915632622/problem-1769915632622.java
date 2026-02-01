// Last updated: 2/1/2026, 8:43:52 AM
1class Solution {
2    public int countMonobit(int n) {
3        int count = 1;
4        int val = 1;
5        while(val <= n){
6            count++;
7            val  = (val << 1) | 1;
8        }
9
10        return count;
11    }
12}
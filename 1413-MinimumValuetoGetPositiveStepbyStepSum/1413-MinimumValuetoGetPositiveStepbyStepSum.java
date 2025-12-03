// Last updated: 12/3/2025, 7:50:09 PM
1class Solution {
2    public int minStartValue(int[] nums) {
3        int minVal = 0;
4        int prefixSum = 0;
5
6        for (int n : nums) {
7            prefixSum += n;
8            minVal = Math.min(minVal, prefixSum);
9        }
10
11        return 1 - minVal;
12    }
13}
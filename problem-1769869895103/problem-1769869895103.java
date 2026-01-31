// Last updated: 1/31/2026, 8:01:35 PM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int first = -1;
4        int last = -1;
5
6        for (int i = 0; i < nums.length; i++) {
7            if (nums[i] == target) {
8                if (first == -1) {
9                    first = i; 
10                }
11                last = i;     
12            }
13        }
14
15        return new int[]{first, last};
16    }
17}
18
19
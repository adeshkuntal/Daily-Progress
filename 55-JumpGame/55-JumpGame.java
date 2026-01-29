// Last updated: 1/29/2026, 2:12:18 PM
1class Solution {
2    public boolean canJump(int[] nums) {
3        int pos = 0;
4        int i = 0;
5
6        while (i <= pos) {
7            if (pos >= nums.length - 1) {
8                return true;
9            }
10            pos = Math.max(pos, i + nums[i]);
11            i++;
12        }
13
14        return false;
15    }
16}
17
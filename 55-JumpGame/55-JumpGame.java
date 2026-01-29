// Last updated: 1/29/2026, 3:37:48 PM
1class Solution {
2    public int jump(int[] nums) {
3        int pos = 0;
4        int i = 0;
5        int count = 0;
6        int end = 0;
7
8        while (i < nums.length - 1) {
9            pos = Math.max(pos, i + nums[i]);
10
11            if (i == end) {
12                count++;
13                end = pos;
14            }
15            i++;
16        }
17
18        return count;
19    }
20}
21
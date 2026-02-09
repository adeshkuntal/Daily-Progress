// Last updated: 2/9/2026, 9:13:23 PM
1import java.util.Arrays;
2
3class Solution {
4    public int longestConsecutive(int[] nums) {
5        if (nums.length == 0) return 0;
6
7        Arrays.sort(nums);
8
9        int ans = 1;
10        int count = 1;
11
12        for (int i = 0; i < nums.length - 1; i++) {
13            if (nums[i + 1] == nums[i]) {
14                continue;
15            } 
16            else if (nums[i + 1] == nums[i] + 1) {
17                count++;
18            } 
19            else {
20                ans = Math.max(ans, count);
21                count = 1;
22            }
23        }
24
25        ans = Math.max(ans, count);
26        return ans;
27    }
28}
29
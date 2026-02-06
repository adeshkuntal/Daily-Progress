// Last updated: 2/6/2026, 1:33:25 PM
1class Solution {
2    public long maximumTripletValue(int[] nums) {
3        int n = nums.length;
4        long ans = 0;
5
6        long leftMax = nums[0];
7        long bestDiff = 0;
8
9        for (int right = 1; right < n; right++) {
10            ans = Math.max(ans, bestDiff * nums[right]);
11
12            bestDiff = Math.max(bestDiff, leftMax - nums[right]);
13            leftMax = Math.max(leftMax, nums[right]);
14        }
15
16        return ans;
17    }
18}
19
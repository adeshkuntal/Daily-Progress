// Last updated: 2/25/2026, 8:21:32 PM
1class Solution {
2    public int minPairSum(int[] nums) {
3        Arrays.sort(nums);
4        int l = 0;
5        int r = nums.length-1;
6        int minSum = 0;
7        while(l<r){
8            minSum = Math.max(minSum,nums[l]+nums[r]);
9            l++;
10            r--;
11        }
12
13        return minSum;
14    }
15}
// Last updated: 2/1/2026, 8:51:31 AM
1class Solution {
2    public int finalElement(int[] nums) {
3        int n = nums.length;
4        if(n==1){
5            return nums[0];
6        }
7
8        return Math.max(nums[0],nums[n-1]);
9    }
10}
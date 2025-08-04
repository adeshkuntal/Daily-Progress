// Last updated: 8/4/2025, 6:52:43 PM
class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        int adjustedMax = max - k;
        int adjustedMin = min + k;
        return Math.max(0, adjustedMax - adjustedMin); 
    }
}
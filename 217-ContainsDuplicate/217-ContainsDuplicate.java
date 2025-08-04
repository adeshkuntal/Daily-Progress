// Last updated: 8/4/2025, 6:56:44 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);  // Sort the array first
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return true;
            }
        }
        return false;
    }
}
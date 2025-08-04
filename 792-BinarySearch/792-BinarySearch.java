// Last updated: 8/4/2025, 6:53:31 PM
class Solution {
    public int search(int[] nums, int target) {
        int r = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                r = i;
            }
        }
        return r;  
    }
}
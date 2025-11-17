// Last updated: 11/17/2025, 8:26:31 PM
class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int lastIdx = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (lastIdx != -1 && i - lastIdx - 1 < k) {
                    return false;
                }
                lastIdx = i;
            }
        }

        return true;
    }
}
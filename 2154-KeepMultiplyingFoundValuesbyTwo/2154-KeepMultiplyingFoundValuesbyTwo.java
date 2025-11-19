// Last updated: 11/19/2025, 8:58:36 PM
class Solution {
    public int findFinalValue(int[] nums, int original) {
        int res = original;
        boolean changed = true;

        while (changed) {
            changed = false;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == res) {
                    res = res * 2;
                    changed = true;
                }
            }
        }

        return res;
    }
}

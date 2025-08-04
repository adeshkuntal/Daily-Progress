// Last updated: 8/4/2025, 6:56:17 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for(int i=0; i<=n; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (i == nums[j]) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                return i;
            }
        }
        return -1;
    }
}
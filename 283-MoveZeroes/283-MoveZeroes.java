// Last updated: 8/4/2025, 6:56:10 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int lastNonZeroFoundAt = 0;

        // Move all the non-zero elements to the front of the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt++] = nums[i];
            }
        }

        // Fill the remaining elements with zeros
        for (int i = lastNonZeroFoundAt; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
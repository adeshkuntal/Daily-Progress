// Last updated: 8/4/2025, 6:54:24 PM
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;

        // Calculate the maximum product from:
        // 1. The product of the three largest numbers
        // 2. The product of the two smallest numbers (most negative) and the largest number
        int maxProduct = Math.max(nums[n - 1] * nums[n - 2] * nums[n - 3],
                nums[0] * nums[1] * nums[n - 1]);

        return maxProduct;
    }
}
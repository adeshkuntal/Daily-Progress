// Last updated: 8/4/2025, 6:54:19 PM
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        Arrays.sort(nums);
        int n = nums.length;
        int actualSum = 0, expectedSum = n * (n + 1) / 2;

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                result[0] = nums[i];
            }
            actualSum += nums[i];
        }

        result[1] = expectedSum - (actualSum - result[0]);
        return result;
    }
}
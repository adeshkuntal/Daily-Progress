// Last updated: 8/4/2025, 6:54:20 PM
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        if (n == 1) {
            return (double) nums[0] / k;
        }

        // Calculate the sum of the first window of size k
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }

        int currentSum = maxSum;
        // Slide the window from start to end in the array
        for (int i = k; i < n; i++) {
            currentSum = currentSum - nums[i - k] + nums[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        // Calculate the maximum average
        return (double) maxSum / k;
    }
}
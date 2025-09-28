// Last updated: 9/28/2025, 8:19:56 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for (int n : nums) {
            low = Math.min(low, n);
            high = Math.max(high, n);
        }

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int count = 0;

            for (int n : nums) {
                if (n >= mid) {
                    count++;
                }
            }

            if (count >= k) {
                low = mid + 1; 
            } else {
                high = mid - 1; 
            }
        }
        return high;
    }
}
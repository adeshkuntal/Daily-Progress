// Last updated: 8/4/2025, 6:49:30 PM
class Solution {
    public int minRemoval(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length, res = n;
        for (int i = 0; i < n; i++) {
            int left = i, right = n - 1, valid = i;
            while (left <= right) {
                int mid = (left + right) / 2;
                if ((long) nums[mid] <= (long) nums[i] * k) {
                    valid = mid;
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            res = Math.min(res, n - (valid - i + 1));
        }
        return res;
    }
}

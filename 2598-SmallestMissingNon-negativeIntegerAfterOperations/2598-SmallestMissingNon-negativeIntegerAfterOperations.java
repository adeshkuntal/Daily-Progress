// Last updated: 10/16/2025, 9:34:48 PM
class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int n = nums.length;
        int res = 0;
        int[] rem = new int[value];
        for (int x : nums) {
            int r = ((x % value) + value) % value;
            rem[r]++;
        }
        while (rem[res % value]-- > 0)
            res++;
        return res;
    }
}

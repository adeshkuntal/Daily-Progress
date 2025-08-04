// Last updated: 8/4/2025, 6:55:08 PM
class Solution {
    public int totalHammingDistance(int[] nums) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            int countOne = 0;
            for (int j = 0; j < nums.length; j++) {
                if ((nums[j] & (1 << i)) != 0) {
                    countOne++;
                }
            }
            int countZero = nums.length - countOne;
            result += countOne * countZero;
        }
        return result;
    }
}
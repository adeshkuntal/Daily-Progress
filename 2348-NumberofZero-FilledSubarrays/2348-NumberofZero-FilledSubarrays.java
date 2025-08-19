// Last updated: 8/19/2025, 7:44:01 PM
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long count = 0;
        long zeros = 0;

        for (int num : nums) {
            if (num == 0) {
                zeros++;
                count += zeros;  
            } else {
                zeros = 0;  
            }
        }
        return count;
    }
}
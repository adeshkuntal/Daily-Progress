// Last updated: 10/1/2025, 8:54:21 PM
class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        int i = 0;
        int j = 0;
        int replaced = 0;
        
        while (j < n) {
            if (nums[j] == 1) {
                j++;
            } 
            else if (replaced < k) {
                replaced++;
                j++;
            } 
            else if (nums[i] == 1) {
                i++;
            } 
            else {
                i++;
                replaced--;
            }
            ans = Math.max(ans, j - i);
        }
        
        return ans;
    }
}


// Last updated: 9/27/2025, 2:10:22 PM
class Solution {
    public int findPeakElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int res = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                res = i;
            }
        }

        return res;
    }
}
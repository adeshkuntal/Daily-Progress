// Last updated: 10/1/2025, 3:21:17 PM
class Solution {
    public boolean canJump(int[] nums) {
        int i = 0;
        int j = 0;
        if(nums.length == 1){
            return true;
        }
        while(i < nums.length && i <= j){
            j = Math.max(j, i + nums[i]);
            if(j >= nums.length - 1){
                return true;
            }
            i++;
        }
        return false;
    }
}

// Last updated: 8/4/2025, 6:58:07 PM
class Solution {
    public boolean canJump(int[] nums) {
        int step = nums[0];
        int jump = 0;
        boolean ans = false;

        if(nums.length==1){
            return true;
        }
        while (jump < nums.length - 1) {
        
            if (step == 0) {
                break; 
            }
            jump += 1;
            step--;
            if (jump < nums.length) {
                step = Math.max(step, nums[jump]);
            }
            if (jump >= nums.length - 1) {
                ans = true;
                break;
            }
        }

        return ans;
    }
}
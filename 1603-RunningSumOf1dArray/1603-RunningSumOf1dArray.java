// Last updated: 8/4/2025, 6:51:00 PM
class Solution {
    public int[] runningSum(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0; i< nums.length; i++){
            int count = 0;
            for(int k=0; k<=i; k++){
                count+=nums[k];
            }
            ans[i] = count;
        }

        return ans;
    }
}
// Last updated: 8/4/2025, 6:51:23 PM
class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        int count = 0;

        for(int i=0; i< nums.length; i++){
            int a = nums[i];
            for(int j=0; j< nums.length; j++){
                if(a>nums[j]){
                    count++;
                }
            }
            ans[i] = count;
            count = 0;
        }
        
        return ans;
    }
}
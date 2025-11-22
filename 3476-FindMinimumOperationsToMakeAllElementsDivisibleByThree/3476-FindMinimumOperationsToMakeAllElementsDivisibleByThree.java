// Last updated: 11/22/2025, 1:17:24 PM
class Solution {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]%3 == 0){
                continue;
            }
            else if((nums[i] + 1)%3 == 0 || (nums[i] - 1)%3 == 0){
                count += 1;
            }
        }
        return count;
    }
}
// Last updated: 3/25/2026, 10:01:28 PM
class Solution {
    public int minimumPrefixLength(int[] nums) {
        int i = nums.length - 1;
        while(i > 0){
            if(nums[i] > nums[i-1]){
                i--;
            }
            else{
                break;
            }
        }

        return i;
    }
}
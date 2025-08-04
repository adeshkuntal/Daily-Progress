// Last updated: 8/4/2025, 6:52:30 PM
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0; i< nums.length; i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
        return nums;   
    }
}
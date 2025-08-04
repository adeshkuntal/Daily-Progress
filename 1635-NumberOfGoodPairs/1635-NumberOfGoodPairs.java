// Last updated: 8/4/2025, 6:50:53 PM
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j< nums.length; j++){
                if(nums[i]==nums[j]){
                    count+=1;
                }
            }
        }

        return count;
    }
}
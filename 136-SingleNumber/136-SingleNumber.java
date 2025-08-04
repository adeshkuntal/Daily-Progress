// Last updated: 8/4/2025, 6:57:20 PM
class Solution {
    public int singleNumber(int[] nums) {
        int c =0;
        int a = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(i!=j && nums[i]==nums[j]){
                    c++;
                }
            }
            if(c==0){
                a=i;
            }
            c=0;
        }
        return nums[a];
    }
}
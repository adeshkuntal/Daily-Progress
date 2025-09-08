// Last updated: 9/8/2025, 11:03:33 AM
import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int count = 1;
        int res = 1;
        int a = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]) continue;
            if(nums[i] == a + count){
                count++;
            }
            else{
                if(count > res){
                    res = count;
                }
                count = 1;
                a = nums[i];
            }
        }
        return Math.max(res, count);
    }
}

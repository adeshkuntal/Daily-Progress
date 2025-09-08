// Last updated: 9/8/2025, 11:22:41 AM
import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        // Time Complexity: O(n log n)

        // if(nums.length == 0) return 0;
        // Arrays.sort(nums);
        // int count = 1;
        // int res = 1;
        // int a = nums[0];
        // for(int i = 1; i < nums.length; i++){
        //     if(nums[i] == nums[i-1]) continue;
        //     if(nums[i] == a + count){
        //         count++;
        //     }
        //     else{
        //         if(count > res){
        //             res = count;
        //         }
        //         count = 1;
        //         a = nums[i];
        //     }
        // }
        // return Math.max(res, count);


        // Time Complexity: O(n)
        if(nums.length == 0) return 0;
        Set<Integer> s = new HashSet<>();
        for(int n : nums){
            s.add(n);
        }
        int res = 1;
        for(int a : s){
            if(!s.contains(a-1)){
                int count = 1;
                while(s.contains(a+count)){
                    count++;
                }
                if(count > res){
                    res = count;
                }
            }
        }
        return res;
    }
}

// Last updated: 3/25/2026, 10:01:34 PM
class Solution {
    public int minimumK(int[] nums) {
        int lo = 1;
        int hi = 0;
        for(int i = 0; i<nums.length; i++){
            hi = Math.max(hi,nums[i]);
        }

        hi = Math.max(hi,nums.length);

        int ans = hi;

        while(lo <= hi){
            int mid = lo + (hi-lo)/2;

            long ops = 0;
            for(int i = 0; i<nums.length; i++){
                ops += (nums[i]+mid-1)/mid;
            }

            if(ops <= (long) mid*mid){
                ans = mid;
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }

        return ans;
    }
}
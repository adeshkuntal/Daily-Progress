// Last updated: 3/25/2026, 10:01:55 PM
class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int ans = 0;
        
        for(int bit = 0; bit<32; bit++){
            int[] dp = new int[n];
            int size = 0;

            for(int i=0; i<n; i++){
                if((nums[i] & (1 << bit)) == 0){
                    continue;
                }
                int l = 0;
                int r = size;
                while(l < r){
                    int m = (l+r)/2;
                    if(dp[m] < nums[i]){
                        l = m+1;
                    }
                    else{
                        r = m;
                    }
                }
                dp[l] = nums[i];
                if(l == size){
                    size++;
                }
            }
            ans = Math.max(ans,size);
        }
        return ans;
    }
}
// Last updated: 8/4/2025, 6:58:09 PM
class Solution {
    public int maxSubArray(int[] arr) {
        int ans = Integer.MIN_VALUE;
        int n = arr.length;
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum+=arr[i];
            ans=Math.max(ans,sum);
            if(sum < 0){
                sum = 0;
            }
        }
        return ans;
    }
}
// Last updated: 9/26/2025, 11:26:44 PM
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
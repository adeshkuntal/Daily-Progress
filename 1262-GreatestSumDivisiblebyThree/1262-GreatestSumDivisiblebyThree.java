// Last updated: 11/23/2025, 1:02:14 PM
// class Solution {
//     public int maxSumDivThree(int[] nums) {
//         int[] dp = new int[nums.length + 1];
//         Arrays.fill(dp,-1);
//         return find_maxsum(nums, 0, 0,dp);
//     }

//     public static int find_maxsum(int[] nums, int idx, int sum,int[] dp) {
//         if (idx == nums.length) {
//             if (sum % 3 == 0) {
//                 return sum;
//             } else {
//                 return 0;
//             }
//         }
//         if(dp[idx] != -1){
//             return dp[idx];
//         }

//         int take = find_maxsum(nums, idx + 1, sum + nums[idx],dp);
//         int skip = find_maxsum(nums, idx + 1, sum,dp);

//         dp[idx] = Math.max(take, skip);
//         return dp[idx];
//     }
// }


class Solution {
    public int maxSumDivThree(int[] nums) {
        int[]dp=new int[3];
        dp[0]=0;
        dp[1]=Integer.MIN_VALUE;
        dp[2]=dp[1];
        for(int val:nums){
            int[]curr=dp.clone();
            for(int i=0;i<dp.length;i++){
                curr[(i+val)%3]=Math.max(curr[(i+val)%3],dp[i]+val);
            }
            dp=curr;
        }
        return dp[0];
    }
}


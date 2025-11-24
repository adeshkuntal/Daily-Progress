// Last updated: 11/24/2025, 10:22:33 PM
// class Solution {
//     public int deleteAndEarn(int[] nums) {
//         int[] dp = new int[nums.length + 1];
//         Arrays.fill(dp, -1);
//         return findPoints(nums, 0, 0, dp);
//     }

//     public static int findPoints(int[] nums, int idx, int point, int[] dp) {
//         if (idx == nums.length) {
//             return point;
//         }

//         if (dp[idx] != -1) {
//             return dp[idx];
//         }

//         int a = findPoints(nums, idx + 1, point + nums[idx], dp);
//         int b = findPoints(nums, idx + 1, point, dp);

//         return dp[idx] = Math.max(a, b);
//     }
// }






class Solution {
    public int deleteAndEarn(int[] nums) {
        int max = 0;
        for (int x : nums){
            max = Math.max(max, x);
        }

        int[] points = new int[max + 1];
        for (int x : nums){
            points[x] += x;
        }

        int prev2 = 0; 
        int prev1 = 0; 

        for (int i = 0; i <= max; i++) {
            int take = prev2 + points[i];
            int skip = prev1;
            int curr = Math.max(take, skip);
            prev2 = prev1;
            prev1 = curr;
        }

        return prev1;
    }
}

// Last updated: 11/24/2025, 10:27:14 PM
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

        int[] dp = new int[max + 1];
        Arrays.fill(dp, -1);

        return solve(points, 0, dp);
    }
    public static int solve(int[] points, int i, int[] dp) {
        if (i >= points.length){
            return 0;
        }

        if (dp[i] != -1){
            return dp[i];
        }
        int a = points[i] + solve(points, i + 2, dp);
        int b = solve(points, i + 1, dp);

        return dp[i] = Math.max(a, b);
    }
}

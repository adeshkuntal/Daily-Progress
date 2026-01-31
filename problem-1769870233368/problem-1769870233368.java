// Last updated: 1/31/2026, 8:07:13 PM
1class Solution {
2    public int[] searchRange(int[] nums, int target) {
3        int[] ans = new int[2];
4        Arrays.fill(ans,-1);
5
6        for(int i=0; i<nums.length; i++){
7            if(nums[i] == target){
8                if(ans[0] == -1){
9                    ans[0] = i;
10                }
11                ans[1] = i;
12            }
13        }
14
15        return ans;
16    }
17}
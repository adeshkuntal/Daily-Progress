// Last updated: 11/29/2025, 7:19:56 PM
1class Solution {
2    public int minOperations(int[] nums, int k) {
3        int sum = 0;
4        for(int i=0; i<nums.length; i++){
5            sum+=nums[i];
6        }
7        int ans = 0;
8        while(sum%k != 0){
9            ans++;
10            sum = sum - 1;
11        }
12
13        return ans;
14    }
15}
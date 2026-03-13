// Last updated: 3/13/2026, 9:12:25 PM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int[] res = new int[nums.length];
4        res[0] = 1;
5        for(int i=1; i<nums.length; i++){
6            res[i] = res[i-1]*nums[i-1];
7        }
8        int right = 1;
9        for(int i=nums.length-1; i>=0; i--){
10            res[i] = res[i]*right;
11            right = right*nums[i];
12        }
13        return res;
14        
15    }
16}
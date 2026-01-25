// Last updated: 1/25/2026, 8:33:26 AM
1class Solution {
2    public int minimumPrefixLength(int[] nums) {
3        int i = nums.length - 1;
4        while(i > 0){
5            if(nums[i] > nums[i-1]){
6                i--;
7            }
8            else{
9                break;
10            }
11        }
12
13        return i;
14    }
15}
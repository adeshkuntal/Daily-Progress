// Last updated: 3/28/2026, 9:07:04 PM
1class Solution {
2    public int minAbsoluteDifference(int[] nums) {
3        int lastOne = -1;
4        int lastTwo = -1;
5        int minDiff = Integer.MAX_VALUE;
6        for(int i=0; i<nums.length; i++){
7            if(nums[i] == 1){
8                lastOne = i;
9                if(lastTwo != -1){
10                    minDiff = Math.min(minDiff,i-lastTwo);
11                }
12            }
13            else if(nums[i] == 2){
14                lastTwo = i;
15                if(lastOne != -1){
16                    minDiff = Math.min(minDiff,i-lastOne);
17                }
18            }
19        }
20        return minDiff == Integer.MAX_VALUE ? -1 : minDiff;
21    }
22}
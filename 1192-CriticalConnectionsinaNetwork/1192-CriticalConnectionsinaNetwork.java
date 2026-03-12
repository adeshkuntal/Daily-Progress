// Last updated: 3/12/2026, 10:12:02 PM
1class Solution {
2    public void sortColors(int[] nums) {
3        for(int j=0; j<nums.length; j++){
4            for(int i=1; i<nums.length-j; i++){
5                if(nums[i] < nums[i-1]){
6                    int temp = nums[i];
7                    nums[i] = nums[i-1];
8                    nums[i-1] = temp;
9                }
10            }
11        }
12    }
13}
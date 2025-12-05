// Last updated: 12/5/2025, 9:14:37 PM
1class Solution {
2    public int countPartitions(int[] nums) {
3        int count = 0;
4        for(int i=0; i<nums.length-1; i++){
5            int left = 0;
6            int right = 0;
7            for(int j=0; j<=i; j++){
8                left += nums[j];
9            }
10            for(int j=i+1; j<nums.length; j++){
11                right += nums[j];
12            }
13            int diff = Math.abs(left - right);
14            if(diff % 2 == 0){
15                count++;
16            }
17        }
18
19        return count;
20    }
21}
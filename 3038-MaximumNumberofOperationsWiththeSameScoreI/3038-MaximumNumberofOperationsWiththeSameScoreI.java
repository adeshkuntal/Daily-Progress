// Last updated: 1/14/2026, 12:36:00 PM
1class Solution {
2    public int maxOperations(int[] nums) {
3        if(nums.length < 2) return 0;
4
5        int sum = nums[0] + nums[1];
6        int count = 0;
7
8        for(int i = 0; i + 1 < nums.length; i += 2){
9            if(nums[i] + nums[i + 1] == sum){
10                count++;
11            } else {
12                break;
13            }
14        }
15        return count;
16    }
17}
18
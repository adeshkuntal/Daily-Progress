// Last updated: 2/27/2026, 2:48:31 PM
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int sum = 0;
4        int left = 0;
5        int minLen = Integer.MAX_VALUE;
6
7        for(int i = 0; i < nums.length; i++){
8            sum += nums[i];
9
10            while(sum >= target){
11                minLen = Math.min(minLen, i - left + 1);
12                sum -= nums[left];
13                left++;
14            }
15        }
16
17        if(minLen == Integer.MAX_VALUE){
18            return 0;
19        }
20        return minLen;
21    }
22}
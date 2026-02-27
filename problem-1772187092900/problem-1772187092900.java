// Last updated: 2/27/2026, 3:41:32 PM
1class Solution {
2    public int numSubarrayProductLessThanK(int[] nums, int k) {
3        if(k <= 1) return 0;
4
5        int left = 0;
6        long product = 1;
7        int count = 0;
8
9        for(int right = 0; right < nums.length; right++){
10            product *= nums[right];
11
12            while(product >= k && left <= right){
13                product /= nums[left];
14                left++;
15            }
16
17            count += right - left + 1;
18        }
19
20        return count;
21    }
22}
// Last updated: 4/1/2026, 12:15:17 PM
1class Solution {
2    public int numberOfSubarrays(int[] nums, int k) {
3        return helper(nums, k) - helper(nums, k - 1);
4    }
5
6    public int helper(int[] nums, int k) {
7        int left = 0;
8        int count = 0;
9        int odd = 0;
10
11        for(int right = 0; right < nums.length; right++){
12            if(nums[right] % 2 != 0){
13                odd++;
14            }
15
16            while(odd > k){
17                if(nums[left] % 2 != 0){
18                    odd--;
19                }
20                left++;
21            }
22
23            count += right - left + 1;
24        }
25
26        return count;
27    }
28}
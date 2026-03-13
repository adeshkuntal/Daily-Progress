// Last updated: 3/13/2026, 9:07:35 PM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int[] res = new int[nums.length];
4        int p = 1;
5        int zero = 0;
6
7        for(int i=0; i<nums.length; i++){
8            if(nums[i] == 0){
9                zero++;
10            }else{
11                p *= nums[i];
12            }
13        }
14
15        for(int i=0; i<nums.length; i++){
16            if(zero > 1){
17                res[i] = 0;
18            }
19            else if(zero == 1){
20                if(nums[i] == 0){
21                    res[i] = p;
22                }else{
23                    res[i] = 0;
24                }
25            }
26            else{
27                res[i] = p/nums[i];
28            }
29        }
30
31        return res;
32    }
33}
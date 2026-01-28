// Last updated: 1/28/2026, 9:51:35 PM
1class Solution {
2    public int minOperations(int[] nums) {
3        int count = 0;
4        for(int i = 0; i < nums.length - 2; i++){
5            if(nums[i] == 0){
6                flip(nums, i);
7                flip(nums, i + 1);
8                flip(nums, i + 2);
9                count++;
10            }
11        }
12
13        if(isOne(nums)){
14            return count;
15        }
16        return -1;
17    }
18
19    public void flip(int[] nums, int idx){
20        if(nums[idx] == 0){
21            nums[idx] = 1;
22        } else {
23            nums[idx] = 0;
24        }
25    }
26
27    public boolean isOne(int[] nums){
28        for(int i = 0; i < nums.length; i++){
29            if(nums[i] == 0){
30                return false;
31            }
32        }
33        return true;
34    }
35}
36
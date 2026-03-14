// Last updated: 3/14/2026, 8:30:27 PM
1class Solution {
2    public int firstUniqueEven(int[] nums) {
3        HashMap<Integer,Integer> map = new HashMap<>();
4        for(int i=0; i<nums.length; i++){
5            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
6        }
7        for(int i=0; i<nums.length; i++){
8            if(nums[i] % 2 == 0 && map.get(nums[i]) == 1){
9                return nums[i];
10            }
11        }
12
13        return -1;
14    }
15}
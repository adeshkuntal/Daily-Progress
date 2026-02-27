// Last updated: 2/27/2026, 10:17:25 PM
1class Solution {
2    public long minCost(int[] nums, int[] cost) {
3        int left = nums[0];
4        int right = nums[0];
5        for(int i: nums){
6            left = Math.min(left,i);
7            right = Math.max(right,i);
8        }
9        long ans = 0;
10        while(left<right){
11            int mid = (left+right)/2;
12            long cost1 = helper(nums, cost, mid);
13            long cost2 = helper(nums,cost, mid+1);
14            if(cost1>cost2){
15                left = mid+1;
16                ans = cost2;
17            }else{
18                right = mid;
19                ans = cost1;
20            }
21            
22        }
23        return ans;
24    }
25    
26    public long helper(int [] nums, int [] cost, int all){
27        long totalCost = 0L;
28        for(int i = 0;i<nums.length;i++){
29            totalCost += 1L*Math.abs(nums[i]-all)*cost[i];
30        }
31        return totalCost;
32    }
33}
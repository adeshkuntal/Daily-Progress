// Last updated: 2/27/2026, 10:19:39 PM
1// class Solution {
2//     public long minCost(int[] nums, int[] cost) {
3//         long ans = Long.MAX_VALUE;
4
5//         for(int i = 0; i < nums.length; i++){
6//             long c = 0;
7//             int n = nums[i];
8
9//             for(int j = 0; j < nums.length; j++){
10//                 c += (long)Math.abs(nums[j] - n) * cost[j];
11//             }
12
13//             ans = Math.min(ans, c);
14//         }
15
16//         return ans;
17//     }
18// }
19
20
21
22
23
24class Solution {
25    public long minCost(int[] nums, int[] cost) {
26        int left = nums[0];
27        int right = nums[0];
28        for(int i: nums){
29            left = Math.min(left,i);
30            right = Math.max(right,i);
31        }
32        long ans = 0;
33        while(left<right){
34            int mid = (left+right)/2;
35            long cost1 = helper(nums, cost, mid);
36            long cost2 = helper(nums,cost, mid+1);
37            if(cost1>cost2){
38                left = mid+1;
39                ans = cost2;
40            }else{
41                right = mid;
42                ans = cost1;
43            }
44            
45        }
46        return ans;
47    }
48    
49    public long helper(int [] nums, int [] cost, int all){
50        long totalCost = 0L;
51        for(int i = 0;i<nums.length;i++){
52            totalCost += 1L*Math.abs(nums[i]-all)*cost[i];
53        }
54        return totalCost;
55    }
56}
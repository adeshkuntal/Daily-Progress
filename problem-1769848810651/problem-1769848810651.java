// Last updated: 1/31/2026, 2:10:10 PM
1class Solution {
2    public int maxResult(int[] nums, int k) {
3        int n = nums.length;
4        int[] dp = new int[n];
5        dp[0] = nums[0];
6
7        Deque<Integer> dq = new ArrayDeque<>();
8        dq.offer(0);
9
10        for(int i = 1; i < n; i++){
11            while(dq.peekFirst() < i - k){
12                dq.pollFirst();
13            }
14
15            dp[i] = nums[i] + dp[dq.peekFirst()];
16
17            while(!dq.isEmpty() && dp[dq.peekLast()] <= dp[i]){
18                dq.pollLast();
19            }
20
21            dq.offerLast(i);
22        }
23
24        return dp[n - 1];
25    }
26}
27
28
29
30
31
32
33// class Solution {
34//     public int maxResult(int[] nums, int k) {
35//         int[] dp = new int[nums.length];
36//         for (int i = 0; i < dp.length; i++){
37//             dp[i] = Integer.MIN_VALUE;
38//         }
39//         return fn(nums, k, 0, dp);
40//     }
41
42//     public int fn(int[] nums, int k, int idx, int[] dp){
43//         if(idx == nums.length - 1){
44//             return nums[idx];
45//         }
46//         if(idx >= nums.length){
47//             return Integer.MIN_VALUE;
48//         }
49//         if(dp[idx] != Integer.MIN_VALUE){
50//             return dp[idx];
51//         }
52
53//         int x = Integer.MIN_VALUE;
54//         for(int i = 1; i <= k; i++){
55//             int next = fn(nums, k, idx + i, dp);
56//             if(next != Integer.MIN_VALUE){
57//                 x = Math.max(x, nums[idx] + next);
58//             }
59//         }
60
61//         return dp[idx] = x;
62//     }
63// }
64
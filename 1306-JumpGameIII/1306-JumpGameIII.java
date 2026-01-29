// Last updated: 1/29/2026, 10:01:11 PM
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
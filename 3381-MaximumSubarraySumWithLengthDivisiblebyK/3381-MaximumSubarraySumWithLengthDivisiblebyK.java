// Last updated: 11/27/2025, 9:20:05 PM
1class Solution {
2    public long maxSubarraySum(int[] nums, int k) {
3        int n = nums.length;
4        long sum = 0;
5        for(int i=0; i<k; i++){
6            sum += nums[i];
7        }
8
9        long[] prefix = new long[n];
10        prefix[k-1] = sum;
11        int prev = 0;
12        long res = prefix[k-1];
13        
14        for(int i =k; i<n; i++){
15            sum += nums[i] - nums[prev];
16            prefix[i] = sum + (prefix[i - k]<0?0:prefix[i-k]);
17            res = Math.max(res, prefix[i]);
18            prev++;
19        }
20        return res;
21    }
22}
23
24
25
26
27
28
29
30// class Solution {
31//     public long maxSubarraySum(int[] nums, int k) {
32//         long maxSum = Long.MIN_VALUE;
33//         for (int i = 0; i < nums.length; i++) {
34//             long currSum = 0;
35//             int len = 0;
36//             for (int j = i; j < nums.length; j++) {
37//                 currSum += nums[j];
38//                 len++;
39//                 if (len % k == 0) {
40//                     maxSum = Math.max(maxSum, currSum);
41//                 }
42//             }
43//         }
44//         return maxSum;
45//     }
46// }
47
48
49
50
51
52
53
54
55
56
57
58
59
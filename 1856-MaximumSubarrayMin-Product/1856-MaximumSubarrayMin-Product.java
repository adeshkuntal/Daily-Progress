// Last updated: 1/20/2026, 3:47:01 PM
1// class Solution {
2//     public int maxSumMinProduct(int[] nums) {
3//         long prod = 0;
4//         long mod = 1000000007L;
5
6//         for(int i = 0; i < nums.length; i++){
7//             int min = nums[i];
8//             long sum = 0;
9
10//             for(int j = i; j < nums.length; j++){
11//                 min = Math.min(min, nums[j]);
12//                 sum += nums[j];
13//                 prod = Math.max(prod, min * sum);
14//             }
15//         }
16
17//         return (int)(prod % mod);
18//     }
19// }
20
21
22
23
24
25
26
27
28
29
30
31class Solution {
32    public int maxSumMinProduct(int[] nums) {
33        int n = nums.length;
34        long[] prefix = new long[n + 1];
35
36        prefix[0] = 0;
37        for(int i = 0; i < n; i++){
38            prefix[i + 1] = prefix[i] + nums[i];
39        }
40
41        Stack<Integer> st = new Stack<>();
42        long ans = 0;
43
44        for(int i = 0; i <= n; i++){
45            int curr = (i == n) ? 0 : nums[i];
46
47            while(!st.isEmpty() && nums[st.peek()] > curr){
48                int idx = st.pop();
49                int left = st.isEmpty() ? 0 : st.peek() + 1;
50                long sum = prefix[i] - prefix[left];
51                ans = Math.max(ans, sum * nums[idx]);
52            }
53
54            st.push(i);
55        }
56
57        return (int)(ans % 1000000007);
58    }
59}
60
61
62
63
64
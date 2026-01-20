// Last updated: 1/20/2026, 3:57:43 PM
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
30class Solution {
31    public int maxSumMinProduct(int[] nums) {
32        int n = nums.length;
33        int mod = 1000000007;
34
35        long[] prefix = new long[n + 1];
36        for(int i = 0; i < n; i++){
37            prefix[i + 1] = prefix[i] + nums[i];
38        }
39
40        int[] left = new int[n];
41        int[] right = new int[n];
42
43        Stack<Integer> st = new Stack<>();
44
45        for(int i = 0; i < n; i++){
46            while(!st.isEmpty() && nums[st.peek()] > nums[i]){
47                st.pop();
48            }
49            left[i] = st.isEmpty() ? -1 : st.peek();
50            st.push(i);
51        }
52
53        st.clear();
54
55        for(int i = n - 1; i >= 0; i--){
56            while(!st.isEmpty() && nums[st.peek()] >= nums[i]){
57                st.pop();
58            }
59            right[i] = st.isEmpty() ? n : st.peek();
60            st.push(i);
61        }
62
63        long ans = 0;
64        for(int i = 0; i < n; i++){
65            int L = left[i] + 1;
66            int R = right[i] - 1;
67            long sum = prefix[R + 1] - prefix[L];
68            ans = Math.max(ans, sum * nums[i]);
69        }
70
71        return (int)(ans % mod);
72    }
73}
74
75
76
77
78
79
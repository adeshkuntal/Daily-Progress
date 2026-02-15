// Last updated: 2/15/2026, 9:45:25 PM
1// class Solution {
2//     public int sumSubarrayMins(int[] arr) {
3//         int mod = (int) 1e9 + 7;
4//         int sum = 0;
5//         for(int i=0; i<arr.length; i++){
6//             int min = arr[i];
7//             for(int j=i; j<arr.length; j++){
8//                 min = Math.min(min,arr[j]);
9//                 sum = (sum + min) % mod;
10//             }
11//         }
12
13//         return sum;
14//     }
15// }
16
17
18
19
20
21class Solution {
22    public int sumSubarrayMins(int[] arr) {
23        int n = arr.length;
24        int mod = 1000000007;
25
26        int[] left = new int[n];
27        int[] right = new int[n];
28
29        Stack<Integer> st = new Stack<>();
30
31        for(int i = 0; i < n; i++){
32            if(st.isEmpty()){
33                left[i] = -1;
34            } else {
35                while(!st.isEmpty() && arr[st.peek()] > arr[i]){
36                    st.pop();
37                }
38                left[i] = st.isEmpty() ? -1 : st.peek();
39            }
40            st.push(i);
41        }
42
43        st.clear();
44
45        for(int i = n - 1; i >= 0; i--){
46            if(st.isEmpty()){
47                right[i] = n;
48            } else {
49                while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
50                    st.pop();
51                }
52                right[i] = st.isEmpty() ? n : st.peek();
53            }
54            st.push(i);
55        }
56
57        long sum = 0;
58        for(int i = 0; i < n; i++){
59            long l = i - left[i];
60            long r = right[i] - i;
61            sum = (sum + arr[i] * l * r) % mod;
62        }
63
64        return (int) sum;
65    }
66}
67
68
69
70
// Last updated: 1/19/2026, 12:35:12 PM
1// class Solution {
2//     public int sumSubarrayMins(int[] arr) {
3//         long mod = 1000000007;
4//         long sum = 0;
5//         for(int i=0; i<arr.length; i++){
6//             for(int j=i; j<arr.length; j++){
7//                 sum += findMin(i,j,arr);
8//             }
9        
10
11//         return (int) (sum % mod);
12//     }
13//     public int findMin(int si,int ei,int[] arr){
14//         int min = arr[si];
15//         for(int i=si+1; i<=ei; i++){
16//             if(arr[i] < min){
17//                 min = arr[i];
18//             }
19//         }
20
21//         return min;
22//     }
23// }
24
25
26
27
28
29
30class Solution {
31    public int sumSubarrayMins(int[] arr) {
32        int n = arr.length;
33        int mod = 1000000007;
34        int[] left = new int[n];
35        int[] right = new int[n];
36        Stack<Integer> st = new Stack<>();
37
38        for(int i = 0; i < n; i++){
39            while(!st.isEmpty() && arr[st.peek()] > arr[i]){
40                st.pop();
41            }
42            left[i] = st.isEmpty() ? i + 1 : i - st.peek();
43            st.push(i);
44        }
45
46        st.clear();
47
48        for(int i = n - 1; i >= 0; i--){
49            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
50                st.pop();
51            }
52            right[i] = st.isEmpty() ? n - i : st.peek() - i;
53            st.push(i);
54        }
55
56        long sum = 0;
57        for(int i = 0; i < n; i++){
58            sum = (sum + (long)arr[i] * left[i] * right[i]) % mod;
59        }
60
61        return (int) sum;
62    }
63}
64
65
66
67
68
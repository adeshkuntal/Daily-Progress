// Last updated: 12/26/2025, 7:11:30 PM
1// class Solution {
2//     public long minEnd(int n, int x) {
3//         long[] ans = new long[n];
4//         ans[0] = x;
5//         for(int i = 1; i < n; i++){
6//             long a = ans[i-1] + 1;
7//             while((a & x) != x){
8//                 a++;
9//             }
10//             ans[i] = a;
11//         }
12//         return ans[n-1];
13//     }
14// }
15
16
17class Solution {
18    public long minEnd(int n, int x) {
19        long result = x;
20        long remaining = n - 1;
21        long position = 1;
22        
23        while (remaining != 0) {
24            if ((x & position) == 0) {
25                result |= (remaining & 1) * position;
26                remaining >>= 1;
27            }
28            position <<= 1;
29        }
30        
31        return result;
32    }
33}
34
35
// Last updated: 1/27/2026, 9:06:55 PM
1// class Solution {
2//     public boolean isZeroArray(int[] nums, int[][] query) {
3//         int i = 0;
4//         while(!zeroArray(nums) && i<query.length){
5//             int si = query[i][0];
6//             int ei = query[i][1];
7//             for(int j=si; j<=ei; j++){
8//                 if(nums[j] > 0){
9//                     nums[j]--;
10//                 }
11//             }
12//             i++;
13//         }
14
15//         return zeroArray(nums);
16//     }
17//     public boolean zeroArray(int[] nums){
18//         for(int i=0; i<nums.length; i++){
19//             if(nums[i] != 0){
20//                 return false;
21//             }
22//         }
23
24//         return true;
25//     }
26// }
27
28
29
30
31
32
33class Solution {
34    public boolean isZeroArray(int[] nums, int[][] query) {
35        int n = nums.length;
36        int[] diff = new int[n + 1];
37
38        for(int i = 0; i < query.length; i++){
39            int si = query[i][0];
40            int ei = query[i][1];
41            diff[si]++;
42            if(ei + 1 < n){
43                diff[ei + 1]--;
44            }
45        }
46
47        int dec = 0;
48        for(int i = 0; i < n; i++){
49            dec += diff[i];
50            if(nums[i] - dec > 0){
51                return false;
52            }
53        }
54
55        return true;
56    }
57}
58
59
60
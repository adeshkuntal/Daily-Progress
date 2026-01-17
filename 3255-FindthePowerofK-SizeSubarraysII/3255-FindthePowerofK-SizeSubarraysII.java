// Last updated: 1/17/2026, 3:56:12 PM
1// class Solution {
2//     public int[] resultsArray(int[] nums, int k) {
3//         int n = nums.length;
4//         int[] res = new int[n-k+1];
5//         for(int i=0; i<res.length; i++){
6//             if(isPower(nums,i,i+k-1)){
7//                 res[i] = nums[i+k-1];
8//             }
9//             else{
10//                 res[i] = -1;
11//             }
12//         }
13//         return res;
14//     }
15
16//     public static boolean isPower(int[] nums,int si,int ei){
17//         int x = nums[si++];
18//         while(si <= ei){
19//             if(nums[si] != x + 1){
20//                 return false;
21//             }
22//             x = nums[si];
23//             si++;
24//         }
25//         return true;
26//     }
27// }
28
29
30
31
32class Solution {
33    public int[] resultsArray(int[] nums, int k) {
34        int n=nums.length;
35        int res[]=new int[n-k+1];
36        int cons=1;
37        if(k==1){
38             return nums;
39        }
40        for (int i=1;i<n;i++){
41            if(nums[i]==nums[i-1]+1){
42                cons++;
43            }
44            else{
45                cons=1;
46            }
47            if(i>=k-1){
48                if(cons>=k){
49                    res[i-k+1]=nums[i];
50                }
51                else{
52                    res[i-k+1]=-1;
53                }
54            }}
55        return res;
56    }
57}
58
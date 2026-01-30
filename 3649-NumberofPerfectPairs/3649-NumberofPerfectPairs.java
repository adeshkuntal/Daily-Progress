// Last updated: 1/30/2026, 9:03:10 PM
1// class Solution {
2//     public long perfectPairs(int[] nums) {
3//         Arrays.sort(nums);
4//         long count = 0;
5//         int n = nums.length;
6
7//         for(int i = 0; i < n; i++){
8//             int j = i + 1;
9//             while(j < n){
10//                 int a = nums[i];
11//                 int b = nums[j];
12
13//                 int min1 = Math.min(Math.abs(a - b), Math.abs(a + b));
14//                 int min2 = Math.min(Math.abs(a), Math.abs(b));
15
16//                 if(min1 <= min2){
17//                     count++;
18//                 }
19//                 j++;
20//             }
21//         }
22//         return count;
23//     }
24// }
25
26
27
28class Solution {
29    public long perfectPairs(int[] nums) {
30        int n = nums.length;
31        long count = 0;
32
33        long[] arr = new long[n];
34        for(int i = 0; i < n; i++){
35            arr[i] = Math.abs((long) nums[i]);
36        }
37
38        Arrays.sort(arr);
39
40        int j = 0;
41        for(int i = 0; i < n; i++){
42            if(j < i) j = i;
43            while(j + 1 < n && arr[j + 1] <= 2 * arr[i]){
44                j++;
45            }
46            count += (j - i);
47        }
48
49        return count;
50    }
51}
52
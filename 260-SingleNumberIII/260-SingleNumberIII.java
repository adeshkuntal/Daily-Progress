// Last updated: 1/17/2026, 1:41:25 PM
1// class Solution {
2//     public int[] singleNumber(int[] nums) {
3//         Arrays.sort(nums);
4//         List<Integer> l = new ArrayList<>();
5//         int a = nums[0];
6//         int count = 0;
7//         for (int i = 0; i < nums.length; i++) {
8//             if (a == nums[i]) {
9//                 count += 1;
10//             } else {
11//                 if (count == 1) {
12//                     l.add(a);
13//                 }
14//                 a = nums[i];
15//                 count = 1;
16//             }
17//         }
18//         if (count == 1) {
19//             l.add(a);
20//         }
21
22//         int[] result = new int[l.size()];
23//         for (int i = 0; i < l.size(); i++) {
24//             result[i] = l.get(i);
25//         }
26
27//         return result;
28//     }
29// }
30
31
32
33
34
35
36
37
38//Using Bit Masking
39class Solution {
40    public int[] singleNumber(int[] nums) {
41        int ans = 0;
42        for(int i=0; i<nums.length; i++){
43            ans = ans^nums[i];
44        }
45
46        int mask = ans&(~(ans-1));
47        int a = 0;
48        for(int i=0; i<nums.length; i++){
49            if((nums[i] & mask) != 0){
50                a ^= nums[i];
51            }
52        }
53
54        int b = ans^a;
55        
56        return new int[]{a,b};
57    }
58}
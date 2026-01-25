// Last updated: 1/25/2026, 10:09:52 PM
1// class Solution {
2//     public long minimalKSum(int[] nums, int k) {
3//         HashSet<Integer> vis = new HashSet<>();
4//         for (int n : nums) vis.add(n);
5//         long sum = 0;
6//         int x = 1;
7
8//         while (k > 0) {
9//             if (!vis.contains(x)) {
10//                 sum += x;
11//                 k--;
12//             }
13//             x++;
14//         }
15
16//         return sum;
17//     }
18// }
19
20
21
22
23
24
25class Solution {
26    public long minimalKSum(int[] nums, int k) {
27        Arrays.sort(nums);
28        long sum = 0;
29        long curr = 1;
30
31        for (int i = 0; i < nums.length && k > 0; i++) {
32            if (nums[i] < curr){
33                continue;
34            }
35
36            if (nums[i] > curr) {
37                long cnt = Math.min(k, nums[i] - curr);
38                sum += (curr + curr + cnt - 1) * cnt / 2;
39                k -= cnt;
40            }
41
42            curr = nums[i] + 1;
43        }
44
45        if (k > 0) {
46            sum += (curr + curr + k - 1) * k / 2;
47        }
48
49        return sum;
50    }
51}
52
53
// Last updated: 3/14/2026, 4:28:54 PM
1import java.util.*;
2
3class Solution {
4    public int[] maxSlidingWindow(int[] nums, int k) {
5        int n = nums.length;
6        Deque<Integer> dq = new ArrayDeque<>();
7        List<Integer> res = new ArrayList<>();
8
9        for (int i = 0; i < k; i++) {
10            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
11                dq.pollLast();
12            }
13            dq.addLast(i);
14        }
15
16        for (int i = k; i < n; i++) {
17            res.add(nums[dq.peekFirst()]);
18
19            while (!dq.isEmpty() && dq.peekFirst() <= i - k) {
20                dq.pollFirst();
21            }
22
23            while (!dq.isEmpty() && nums[dq.peekLast()] <= nums[i]) {
24                dq.pollLast();
25            }
26
27            dq.addLast(i);
28        }
29
30        res.add(nums[dq.peekFirst()]);
31
32        int[] ans = new int[res.size()];
33        for (int i = 0; i < res.size(); i++) {
34            ans[i] = res.get(i);
35        }
36        return ans;
37    }
38}
39
40
41
42
43
44
45// class Solution {
46//     public int[] maxSlidingWindow(int[] nums, int k) {
47//         List<Integer> ans = new ArrayList<>();
48//         for(int i=0; i<=nums.length-k; i++){
49//             int curr = nums[i];
50//             for(int j=i; j<k+i; j++){
51//                 curr = Math.max(curr,nums[j]);
52//             }
53//             ans.add(curr);
54//         }
55//         int[] res = new int[ans.size()];
56//         for(int i=0; i<ans.size(); i++){
57//             res[i] = ans.get(i);
58//         }
59//         return res;
60//     }
61// }
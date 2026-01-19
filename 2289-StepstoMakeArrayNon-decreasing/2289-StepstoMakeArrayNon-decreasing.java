// Last updated: 1/19/2026, 10:04:04 PM
1class Solution {
2    public int totalSteps(int[] nums) {
3        Stack<int[]> stack = new Stack<>();
4        int max = 0;
5
6        for (int num : nums) {
7            int score = 0;
8
9            while (!stack.isEmpty() && stack.peek()[0] <= num) {
10                score = Math.max(score, stack.pop()[1]);
11            }
12
13            int curr = stack.isEmpty() ? 0 : score + 1;
14            stack.push(new int[]{num, curr});
15            max = Math.max(max, curr);
16        }
17
18        return max;
19    }
20}
21
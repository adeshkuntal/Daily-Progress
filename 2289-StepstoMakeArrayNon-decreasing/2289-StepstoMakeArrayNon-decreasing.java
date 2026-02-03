// Last updated: 2/3/2026, 2:57:07 PM
1class Solution {
2    public int totalSteps(int[] nums) {
3        Stack<int[]> stack = new Stack<>();
4        int max = 0;
5
6        for (int num : nums) {
7            int score = 0;
8
9            while (!stack.isEmpty() && stack.peek()[0] <= num) {
10                score = Math.max(score, stack.peek()[1]);
11                stack.pop();
12            }
13
14            int curr = stack.isEmpty() ? 0 : score + 1;
15            stack.push(new int[]{num, curr});
16            max = Math.max(max, curr);
17        }
18
19        return max;
20    }
21}
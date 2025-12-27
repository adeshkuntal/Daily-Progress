// Last updated: 12/27/2025, 7:21:21 PM
1class Solution {
2    public long numberOfSubarrays(int[] A) {
3        ArrayDeque<int[]> stack = new ArrayDeque<>();
4        long res = 0;
5        for (int a : A) {
6            while (!stack.isEmpty() && stack.peek()[0] < a){
7                stack.pop();
8            }
9            if (stack.isEmpty() || stack.peek()[0] != a){
10                stack.push(new int[]{a, 0});
11            }
12            res += ++stack.peek()[1];
13        }
14        return res;
15    
16    }
17}
// Last updated: 3/21/2026, 9:19:40 PM
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        int n = nums.length;
4        int[] ans = new int[n];
5        Stack<Integer> st = new Stack<>();
6
7        for(int i = 0; i < n; i++){
8            ans[i] = -1;
9        }
10
11        for(int i = 0; i < 2 * n; i++){
12            int idx = i % n;
13
14            while(!st.isEmpty() && nums[idx] > nums[st.peek()]){
15                ans[st.pop()] = nums[idx];
16            }
17
18            if(i < n){
19                st.push(idx);
20            }
21        }
22
23        return ans;
24    }
25}
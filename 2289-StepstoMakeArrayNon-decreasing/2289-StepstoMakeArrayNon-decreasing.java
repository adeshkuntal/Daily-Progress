// Last updated: 2/3/2026, 12:39:06 PM
1class Solution {
2    public int totalSteps(int[] nums) {
3        Stack<int[]> st = new Stack<>();
4        st.push(new int[]{nums[0], 0});
5
6        int max = 0;
7
8        for(int i = 1; i < nums.length; i++){
9            int count = 0;
10
11            while(!st.isEmpty() && nums[i] >= st.peek()[0]){
12                count = Math.max(count, st.peek()[1]);
13                st.pop();
14            }
15
16            if(!st.isEmpty()){
17                count++;
18            }
19
20            max = Math.max(max, count);
21            st.push(new int[]{nums[i], count});
22        }
23
24        return max;
25    }
26}
27
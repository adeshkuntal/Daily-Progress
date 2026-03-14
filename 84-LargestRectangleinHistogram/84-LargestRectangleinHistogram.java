// Last updated: 3/14/2026, 8:12:50 PM
1class Solution {
2    public int largestRectangleArea(int[] height) {
3        int n = height.length;
4        int[] rsn = new int[n];
5        int[] lsn = new int[n];
6        Stack<Integer> s = new Stack<>();
7        for(int i=0; i<n; i++){
8            while(!s.isEmpty() && height[s.peek()] >= height[i]){
9                s.pop();
10            }
11            lsn[i] = s.isEmpty() ? -1 : s.peek();
12            s.push(i);
13        }
14        s.clear();
15        for(int i=n-1; i>=0; i--){
16            while(!s.isEmpty() && height[s.peek()] >= height[i]){
17                s.pop();
18            }
19            rsn[i] = s.isEmpty() ? n : s.peek();
20            s.push(i);
21        }
22
23        int ans = 0;
24        for(int i = 0; i<n; i++){
25            int curr = height[i]*(rsn[i]-lsn[i]-1);
26            ans = Math.max(ans,curr);
27        }
28        return ans;
29
30    }
31}
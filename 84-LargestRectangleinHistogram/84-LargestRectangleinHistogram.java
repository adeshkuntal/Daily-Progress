// Last updated: 3/14/2026, 8:13:06 PM
1import java.util.*;
2
3class Solution {
4    public int largestRectangleArea(int[] height) {
5
6        int n = height.length;
7        int[] rsn = new int[n];
8        int[] lsn = new int[n];
9
10        Stack<Integer> s = new Stack<>();
11
12        for(int i = 0; i < n; i++){
13            while(!s.isEmpty() && height[s.peek()] >= height[i]){
14                s.pop();
15            }
16
17            lsn[i] = s.isEmpty() ? -1 : s.peek();
18            s.push(i);
19        }
20
21        s.clear();
22
23        for(int i = n-1; i >= 0; i--){
24            while(!s.isEmpty() && height[s.peek()] >= height[i]){
25                s.pop();
26            }
27
28            rsn[i] = s.isEmpty() ? n : s.peek();
29            s.push(i);
30        }
31
32        int ans = 0;
33
34        for(int i = 0; i < n; i++){
35            int curr = height[i] * (rsn[i] - lsn[i] - 1);
36            ans = Math.max(ans, curr);
37        }
38
39        return ans;
40    }
41}
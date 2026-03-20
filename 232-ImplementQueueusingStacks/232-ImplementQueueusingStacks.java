// Last updated: 3/20/2026, 5:36:37 PM
1import java.util.*;
2
3class Solution {
4    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
5        Stack<Integer> st = new Stack<>();
6        HashMap<Integer, Integer> map = new HashMap<>();
7        
8        for(int i = 0; i < nums2.length; i++){
9            while(!st.isEmpty() && nums2[i] > st.peek()){
10                map.put(st.pop(), nums2[i]);
11            }
12            st.push(nums2[i]);
13        }
14        
15        while(!st.isEmpty()){
16            map.put(st.pop(), -1);
17        }
18        
19        int[] ans = new int[nums1.length];
20        
21        for(int i = 0; i < nums1.length; i++){
22            ans[i] = map.get(nums1[i]);
23        }
24        
25        return ans;
26    }
27}
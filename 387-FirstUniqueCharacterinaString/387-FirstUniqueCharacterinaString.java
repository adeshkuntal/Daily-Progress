// Last updated: 3/20/2026, 11:04:06 PM
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3        Stack<Integer> st = new Stack<>();
4        HashMap<Integer, Integer> map = new HashMap<>();
5
6        for(int i = 0; i < nums2.length; i++){
7            while(!st.isEmpty() && nums2[i] > st.peek()){
8                map.put(st.pop(), nums2[i]);
9            }
10            st.push(nums2[i]);
11        }
12
13        while(!st.isEmpty()){
14            map.put(st.pop(), -1);
15        }
16
17        int[] ans = new int[nums1.length];
18
19        for(int i = 0; i < nums1.length; i++){
20            ans[i] = map.get(nums1[i]);
21        }
22
23        return ans;
24    }
25}
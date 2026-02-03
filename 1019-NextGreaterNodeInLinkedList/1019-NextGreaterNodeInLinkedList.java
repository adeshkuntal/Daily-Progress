// Last updated: 2/3/2026, 12:00:47 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11 class Solution {
12    public int[] nextLargerNodes(ListNode head) {
13        ArrayList<Integer> l = new ArrayList<>();
14        ListNode curr = head;
15
16        while(curr != null){
17            l.add(curr.val);
18            curr = curr.next;
19        }
20
21        int n = l.size();
22        int[] arr = new int[n];
23        // for(int i = 0; i < n; i++){
24        //     int next = 0;
25        //     for(int j = i + 1; j < n; j++){
26        //         if(l.get(j) > l.get(i)){
27        //             next = l.get(j);
28        //             break;
29        //         }
30        //     }
31        //     arr[i] = next;
32        // }
33        // return arr;
34
35        Stack<Integer> st = new Stack<>();
36
37        for(int i = n - 1; i >= 0; i--){
38            while(!st.isEmpty() && l.get(st.peek()) <= l.get(i)){
39                st.pop();
40            }
41            arr[i] = st.isEmpty() ? 0 : l.get(st.peek());
42            st.push(i);
43        }
44        return arr;
45    }
46}
47
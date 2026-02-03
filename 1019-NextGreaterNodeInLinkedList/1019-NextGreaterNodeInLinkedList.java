// Last updated: 2/3/2026, 11:29:32 AM
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
23
24        for(int i = 0; i < n; i++){
25            int next = 0;
26            for(int j = i + 1; j < n; j++){
27                if(l.get(j) > l.get(i)){
28                    next = l.get(j);
29                    break;
30                }
31            }
32            arr[i] = next;
33        }
34        return arr;
35    }
36}
37
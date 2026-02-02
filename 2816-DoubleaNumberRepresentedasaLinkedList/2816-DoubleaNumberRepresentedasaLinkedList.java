// Last updated: 2/2/2026, 2:26:02 PM
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
11
12class Solution {
13    public ListNode doubleIt(ListNode head) {
14        head = reverse(head);
15
16        ListNode curr = head;
17        int carry = 0;
18
19        while (curr != null) {
20            int val = curr.val * 2 + carry;
21            curr.val = val % 10;
22            carry = val / 10;
23
24            if (curr.next == null && carry > 0) {
25                curr.next = new ListNode(carry);
26                carry = 0;
27                break;
28            }
29            curr = curr.next;
30        }
31        
32        return reverse(head);
33    }
34
35    private ListNode reverse(ListNode head) {
36        ListNode prev = null;
37        while (head != null) {
38            ListNode next = head.next;
39            head.next = prev;
40            prev = head;
41            head = next;
42        }
43        return prev;
44    }
45}
46
47
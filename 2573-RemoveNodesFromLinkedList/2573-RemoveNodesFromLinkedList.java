// Last updated: 8/4/2025, 6:49:32 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNodes(ListNode head) {
        head = reverse(head);
        int max = head.val;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        ListNode curr = head;

        while (curr != null) {
            if (curr.val >= max) {
                max = curr.val;
                temp.next = new ListNode(curr.val);
                temp = temp.next;
            }
            curr = curr.next;
        }

        return reverse(dummy.next);
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        return prev;
    }
}

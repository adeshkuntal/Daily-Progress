// Last updated: 8/4/2025, 6:57:10 PM
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
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            if (curr.val <= curr.next.val) {
                curr = curr.next;
            } else {
                ListNode toInsert = curr.next;
                curr.next = toInsert.next;

                // Find insertion point
                ListNode prev = dummy;
                while (prev.next.val <= toInsert.val) {
                    prev = prev.next;
                }

                // Insert the node
                toInsert.next = prev.next;
                prev.next = toInsert;
            }
        }

        return dummy.next;
    }
}

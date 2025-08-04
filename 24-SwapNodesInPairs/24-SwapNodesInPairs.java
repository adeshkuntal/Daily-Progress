// Last updated: 8/4/2025, 6:58:31 PM
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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode curr = dummy;
        ListNode currNode = dummy;

        while (currNode.next != null && currNode.next.next != null) {
            ListNode first = currNode.next;
            ListNode second = currNode.next.next;

            first.next = second.next;
            second.next = first;
            currNode.next = second;

            currNode = first;
        }

        return dummy.next;
    }
}

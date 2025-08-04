// Last updated: 8/4/2025, 6:58:02 PM
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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        int length = 1;
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        k = k % length;
        if (k == 0) return head;

        for (int i = 0; i < k; i++) {
            ListNode curr = head;
            while (curr.next.next != null) {
                curr = curr.next;
            }
            ListNode newHead = curr.next;
            curr.next = null;
            newHead.next = head;
            head = newHead;
        }

        return head;
    }
}

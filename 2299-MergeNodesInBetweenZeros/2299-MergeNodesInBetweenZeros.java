// Last updated: 8/4/2025, 6:49:35 PM
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
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        int sum = 0;
        ListNode fast = head.next;

        while (fast != null) {
            if (fast.val != 0) {
                sum += fast.val;
            } else {
                curr.next = new ListNode(sum);
                curr = curr.next;
                sum = 0;
            }
            fast = fast.next;
        }

        return dummy.next;
    }
}

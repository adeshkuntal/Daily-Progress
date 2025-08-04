// Last updated: 8/4/2025, 6:49:26 PM
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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            int num1 = curr.val;
            int num2 = curr.next.val;
            while (num2 != 0) {
                int temp = num2;
                num2 = num1 % num2;
                num1 = temp;
            }
            ListNode dummy = new ListNode(num1);
            dummy.next = curr.next;
            curr.next = dummy;
            curr = dummy.next;
        }
        return head;
    }
}

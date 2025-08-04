// Last updated: 8/4/2025, 6:54:47 PM
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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr1 = head; 
        int a = k - 1;
        int size = 0;
        ListNode first = null;

        while (curr1 != null) {
            if (a == 0) {
                first = curr1;
            }
            curr1 = curr1.next;
            size++;
            a--;
        }

        int b = size - k;
        ListNode second = head;

        while (b != 0) {
            second = second.next;
            b--;
        }

        int temp = first.val;
        first.val = second.val;
        second.val = temp;

        return head;
    }
}

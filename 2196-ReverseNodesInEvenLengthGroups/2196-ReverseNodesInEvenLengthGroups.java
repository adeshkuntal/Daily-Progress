// Last updated: 8/4/2025, 6:49:38 PM
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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode curr = head;
        int group = 1;

        while (curr != null) {
            int count = 0;
            ListNode temp = curr;
            while (temp != null && count < group) {
                temp = temp.next;
                count++;
            }

            if (count % 2 == 0) {
                ListNode prev = null;
                ListNode start = curr;
                for (int i = 0; i < count; i++) {
                    ListNode nextNode = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = nextNode;
                }

                // connect reversed part
                start.next = curr;
                if (head == start) {
                    head = prev;
                } else {
                    ListNode preStart = head;
                    while (preStart.next != start) {
                        preStart = preStart.next;
                    }
                    preStart.next = prev;
                }
            } else {
                for (int i = 0; i < count; i++) {
                    if (curr != null)
                        curr = curr.next;
                }
            }

            group++;
        }

        return head;
    }
}

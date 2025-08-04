// Last updated: 8/4/2025, 6:58:38 PM
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }

        if(size == n){
            return head.next;
        }

        int k = size - n;
        ListNode curr = head;
        for(int i = 1; i < k; i++){
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return head;
    }
}

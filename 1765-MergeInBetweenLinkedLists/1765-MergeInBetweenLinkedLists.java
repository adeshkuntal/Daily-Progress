// Last updated: 8/4/2025, 6:50:25 PM
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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode curr = list1;
        int index = 0;

        while(index < a - 1){
            curr = curr.next;
            index++;
        }

        ListNode beforeA = curr;
        curr = curr.next;

        index = a;
        while(index < b){
            curr = curr.next;
            index++;
        }

        ListNode afterB = curr.next;
        beforeA.next = list2;

        ListNode curr2 = list2;
        while(curr2.next != null){
            curr2 = curr2.next;
        }

        curr2.next = afterB;
        return list1;
    }
}

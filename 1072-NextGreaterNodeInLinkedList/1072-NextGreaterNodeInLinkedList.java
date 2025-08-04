// Last updated: 8/4/2025, 6:52:15 PM
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
    public int[] nextLargerNodes(ListNode head) {
        ListNode curr = head;
        List<Integer> l = new ArrayList<>();

        while (curr != null) {
            int a = curr.val;
            int max = 0;
            ListNode curr2 = curr.next;
            while (curr2 != null) {
                int b = curr2.val;
                if (b > a) {
                    max = b;
                    break;
                }
                curr2 = curr2.next;
            }
            l.add(max);
            curr = curr.next;
        }

        int[] res = new int[l.size()];
        for (int i = 0; i < l.size(); i++) {
            res[i] = l.get(i);
        }

        return res;
    }
}

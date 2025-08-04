// Last updated: 8/4/2025, 6:49:41 PM
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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int x = 1;
        ListNode slow = head;
        ListNode fast = head.next;
        ListNode next = (fast != null) ? fast.next : null;
        List<Integer> l = new ArrayList<>();

        while (next != null) {
            if ((fast.val > slow.val && fast.val > next.val) ||
                (fast.val < slow.val && fast.val < next.val)) {
                l.add(x);
            }
            slow = fast;
            fast = next;
            next = next.next;
            x++;
        }

        if (l.size() < 2) {
            return new int[]{-1, -1};
        } else {
            int minDis = Integer.MAX_VALUE;
            for (int i = 1; i < l.size(); i++) {
                minDis = Math.min(minDis, l.get(i) - l.get(i - 1));
            }
            int maxDis = l.get(l.size() - 1) - l.get(0);
            return new int[]{minDis, maxDis};
        }
    }
}

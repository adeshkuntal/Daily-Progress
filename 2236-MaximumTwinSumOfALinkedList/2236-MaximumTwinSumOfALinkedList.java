// Last updated: 8/4/2025, 6:49:37 PM
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
    public int pairSum(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode curr = head;

        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        int maxSum = 0;
        int n = list.size();

        for (int i = 0; i < n / 2; i++) {
            int sum = list.get(i) + list.get(n - 1 - i);
            maxSum = Math.max(maxSum, sum);
        }

        return maxSum;
    }
}

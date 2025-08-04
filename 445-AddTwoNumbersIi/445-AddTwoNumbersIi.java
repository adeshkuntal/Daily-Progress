// Last updated: 8/4/2025, 6:55:23 PM
import java.util.Stack;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        // Push all values of l1 into stack s1
        while (l1 != null) {
            s1.push(l1.val);
            l1 = l1.next;
        }

        // Push all values of l2 into stack s2
        while (l2 != null) {
            s2.push(l2.val);
            l2 = l2.next;
        }

        int carry = 0;
        ListNode result = null;

        // Pop from stacks and add values
        while (!s1.isEmpty() || !s2.isEmpty() || carry != 0) {
            int x = (!s1.isEmpty()) ? s1.pop() : 0;
            int y = (!s2.isEmpty()) ? s2.pop() : 0;

            int sum = x + y + carry;
            carry = sum / 10;

            ListNode node = new ListNode(sum % 10);
            node.next = result;
            result = node;
        }

        return result;
    }
}

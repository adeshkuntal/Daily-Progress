// Last updated: 8/4/2025, 6:53:49 PM
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];

        // Step 1: Count total nodes
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }

        int baseSize = length / k;
        int extra = length % k;

        current = head;
        for (int i = 0; i < k; i++) {
            ListNode partHead = current;
            int partSize = baseSize + (i < extra ? 1 : 0);

            for (int j = 0; j < partSize - 1; j++) {
                if (current != null) current = current.next;
            }

            if (current != null) {
                ListNode next = current.next;
                current.next = null;
                current = next;
            }

            result[i] = partHead;
        }

        return result;
    }
}

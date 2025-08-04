// Last updated: 8/4/2025, 6:51:24 PM
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
    public int getDecimalValue(ListNode head) {
        String sr = "";
        ListNode curr = head;
        while(curr != null){
            sr += curr.val;
            curr = curr.next;
        }
        int s = 0;
        for(int i = 0; i < sr.length(); i++){
            if(sr.charAt(i) != '0'){
                int a = (int) Math.pow(2, sr.length() - 1 - i);
                s += a;
            }
        }

        return s;
    }
}

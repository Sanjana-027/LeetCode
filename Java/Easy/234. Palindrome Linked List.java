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
    private  boolean res = true;
    public boolean isPalindrome(ListNode head) {
        helper(head, head);
        return res;
    }
    
    private ListNode helper(ListNode head, ListNode tail) {
        if (tail == null || !res) {
            return head;
        }
        head = helper(head, tail.next);
        if (head.val != tail.val) {
            res = false;
        }
        return head.next;
    }
}

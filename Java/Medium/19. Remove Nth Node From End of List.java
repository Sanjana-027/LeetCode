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
    int count = 0;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        return removeNthFromEnd(head, n, null);
    }
    public ListNode removeNthFromEnd(ListNode head, int n, ListNode prev) {
        if (head == null) return head;
        
        removeNthFromEnd(head.next, n, head);
        count++;
        if (count == n) {
            if (prev == null) {
                return head.next;
            }
            prev.next = head.next;
            return prev;
        }
        
        return head;
    }
}

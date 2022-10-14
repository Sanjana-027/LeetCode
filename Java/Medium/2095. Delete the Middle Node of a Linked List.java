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
    int mid = 0;
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) return null;
        middle(head, 0);
        return head;
    }
    
    private void middle(ListNode head, int count) {
        if (head == null) {
            // System.out.print(count);
            mid = (count / 2) - 1;
            return;
        }
        ListNode newHead = head;
        middle(head.next, count + 1);
       // System.out.println(count);
        if (count == mid) {
            head.next = head.next.next;
        }
        
        // if(head != null) 
        //System.out.print(newHead.val);
        return;
    }
}

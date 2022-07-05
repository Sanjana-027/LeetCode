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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
       return addLists(l1, l2, 0);
    }
    
    public ListNode addLists(ListNode l1, ListNode l2, int carry){
        if(l1 == null && l2 == null && carry == 0)
            return null;
        
        int digit = carry;
        digit += (l1 != null) ? l1.val : 0;
        digit += (l2 != null) ? l2.val : 0;
        
        carry = digit / 10;
        digit = digit % 10;
        
        ListNode head = new ListNode(digit);
        head.next = addLists((l1 != null) ? l1.next : null, (l2 != null) ? l2.next : null, carry);
        
        return head;
    }
}
        

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
    public ListNode partition(ListNode head, int x) {
        ListNode tempHead = head;

        ListNode list1 = new ListNode(0);
        ListNode list2 = new ListNode(0);

        ListNode list1Head = list1;
        ListNode list2Head = list2;

        while (tempHead != null) {
            if (tempHead.val < x) {
                list1.next = new ListNode(tempHead.val);
                list1 = list1.next;
            }
            else {
                list2.next = new ListNode(tempHead.val);
                list2 = list2.next;
            }
            tempHead = tempHead.next;
        }

        list1.next = list2Head.next;
        return list1Head.next;
    }
}

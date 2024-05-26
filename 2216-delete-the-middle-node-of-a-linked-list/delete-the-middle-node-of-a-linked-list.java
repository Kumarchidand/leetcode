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
    public ListNode deleteMiddle(ListNode head) {
        // if single element present
        if(head.next==null){
            return null;
        }
        ListNode fast=head;
        ListNode slow=head;
        while(fast.next.next!=null && fast.next.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        // now deletion
        // 1 2 3 4 5
        //  slow=2,slow.next=3,slow.next.next=4
        slow.next=slow.next.next;
        return head;
    }
}
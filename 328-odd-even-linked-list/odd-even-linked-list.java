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
    public ListNode oddEvenList(ListNode head) {
        // alternate odd,even
        if(head==null) return head;
        ListNode odd=head;
        ListNode even=head.next;
        // odd ko to return kar denge but even ko maintain karna hoga
        ListNode evenNode=even;

        while(even!=null && even.next!=null){
        //   change the pointer of odd list
        odd.next=odd.next.next;
        odd=odd.next;
        // change the pointer of even list
        even.next=even.next.next;
        even=even.next;
        }
          // assign the even list at end of odd list
        odd.next=evenNode;
        return head;
    }
}
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null) return false;   // no node
        if(head.next==null) return false;   //  single element
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null){
            if(slow==null) return false;
          slow=slow.next;
          if(fast.next==null)  return false;
          fast=fast.next.next;
          if(slow==fast){
            return true;
          }
        }
        return false;
        
    }
}
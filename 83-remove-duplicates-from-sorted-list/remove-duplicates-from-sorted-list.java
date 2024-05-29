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
    public ListNode deleteDuplicates(ListNode head) {
         if(head==null || head.next==null) return head;
        ListNode ptr=head.next;
        ListNode dummy=new ListNode(head.val);
        ListNode ans=dummy;
      
        while(ptr!=null){
         if(ans.val!=ptr.val){
          ListNode a=new ListNode(ptr.val);
           ans.next=a;
           ans=a;
         ptr=ptr.next;
        }
        else{
            ptr=ptr.next;
        }
    } 
        return dummy;
    }
}
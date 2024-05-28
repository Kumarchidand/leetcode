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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // ListNode temp1=list1;
        // ListNode temp2=list2;
        // ListNode head=new ListNode(100);
        // ListNode temp=head;
        // while(temp1!=null && temp2!=null){
        //     if(temp1.val<temp2.val){
        //         // add in list
        //         ListNode a=new ListNode(temp1.val);
        //         temp.next=a;
        //         temp=a;
        //         temp1= temp1.next;
        //     }
        //     else{  
        //         // add in list
        //         ListNode a=new ListNode(temp2.val);
        //         temp.next=a;
        //         temp=a;
        //         temp2= temp2.next;
        //     }
        // }
        // if(temp2==null){
        //     temp.next=temp1;
        // }else{
        //     temp.next=temp2;
        // }
        // return head.next;
        ListNode t1=list1;
        ListNode t2=list2;
        ListNode t=new ListNode(100);
        ListNode h=t;
        while(t1!=null && t2!=null){
           if(t1.val < t2.val){
            t.next=t1;
            t=t1;
            t1=t1.next;
           }else{
            t.next=t2;
            t=t2;
            t2=t2.next;
           }
        }
        if(t1==null){
            t.next=t2;
        }else{
            t.next=t1;
        }
        return h.next;
    }
}
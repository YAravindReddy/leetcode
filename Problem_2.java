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
        ListNode dummy_head= new ListNode(0);
        ListNode l3= dummy_head;
        int carry=0;
        while(l1!=null  || l2!=null){
           int val_l1 = (l1!=null) ? l1.val: 0;
           int val_l2 = (l2!=null) ? l2.val: 0;
            int sum= val_l1+ val_l2+ carry;
            carry= sum/10;
            ListNode temp_node= new ListNode(sum%10);
            l3.next= temp_node;
            
            if(l1!=null) l1=l1.next;
            if(l2!=null) l2=l2.next;
            l3=l3.next;
        }
        if(carry>0){
         ListNode l= new ListNode(carry);
         l3.next= l;
            l3=l3.next;
        }
        return dummy_head.next;
    }
}
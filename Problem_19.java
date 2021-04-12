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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length=0;
        ListNode dummy= new ListNode(0);
        dummy.next=head;
        //ListNode first= head;
        while(head!=null){
            length++;
            head=head.next;
        }
        length= length-n;
        head= dummy;
        while(length>0){
            length--;
            head=head.next;
        }
        head.next= head.next.next;
        return dummy.next;
        
    }
}
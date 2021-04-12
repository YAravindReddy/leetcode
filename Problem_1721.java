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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode dummy= new ListNode(0);
        dummy.next= head;
        ListNode first = dummy;
        ListNode second= dummy;
        //ListNode third= head;
        for(int i=0;i<k;i++){
            first= first.next;
        }
        ListNode f= first;
        
        while(f!=null){
            second= second.next;
            f= f.next;
        }
        int temp= first.val;
        first.val= second.val;
        second.val=temp;
        
        
        return dummy.next;
        
    }
}
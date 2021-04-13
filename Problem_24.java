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
    public ListNode swapPairs(ListNode head) {
        ListNode slow = head;
ListNode fast = head!=null?head.next:head;
while(slow!=null && fast!=null)
{
int temp = slow.val;
slow.val = fast.val;
fast.val = temp;

        slow = fast.next;
        if(slow!=null)
           fast = slow.next;
    }
    return head;

    }
}
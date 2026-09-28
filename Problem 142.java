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
    public ListNode detectCycle(ListNode head) {
        if(head==null)return head;
        ListNode fast=head;
        ListNode slow=head;
        ListNode temp=head;
        //finding if cycle exixts
        while(fast!=null  && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
        //finding the beginning of the cycle
        if(slow==fast){
            while(temp!=slow){
                temp=temp.next;
                slow=slow.next;
            }
            return temp;
        }
        }
        return null;
    }
}

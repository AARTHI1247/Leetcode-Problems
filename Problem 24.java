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
        if(head==null || head.next==null) return head;
        ListNode fir=head;
        ListNode dummy=new ListNode(0);
         dummy.next=head;
         ListNode prev=dummy;
        ListNode sec=head.next;
        ListNode after=sec.next;
        while(fir!=null && fir.next!=null ){
            prev.next=sec;
            sec.next=fir;
            fir.next=after;
            prev=fir;
            fir=fir.next;
             if(fir == null || fir.next == null)
                break;
            sec=fir.next;
            after=sec.next;

        }
        return dummy.next;
    }
}

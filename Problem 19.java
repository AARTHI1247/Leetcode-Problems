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
        if(head==null)return null;
        //reversing the linkedlist
        ListNode curr=head;
        ListNode prev=head;
        ListNode temp=head.next;
        curr.next=null;
        curr=temp;
        while(curr!=null){
            temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        // deletion of node
        ListNode newhead=prev;
        ListNode current;
        if(n==1) newhead=newhead.next;
        else{
            current=newhead;
        for(int i=1;i<n-1;i++) {
            current=current.next;
        }
        current.next=current.next.next;
        }
        //again reversing the linkedlist
        ListNode newcurr=newhead;
        ListNode newprev=null;
        while(newcurr!=null){
           ListNode newtemp=newcurr.next;
            newcurr.next=newprev;
            newprev=newcurr;
            newcurr=newtemp;
        }
        return newprev;
    }
}

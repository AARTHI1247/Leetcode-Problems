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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null) return head;
        ListNode fast=head;
        //findling length of LL 
        int n=0;
        while(fast!=null) {
        n++;
        fast=fast.next;}
        //finding the ind
        k=k%n;
        if(k==0) return head;
        int ind=n-k;
        ListNode fast1=head;
        ListNode originalheadof_secondhalf=head;
        for(int f=0;f<ind-1;f++){
            fast1=fast1.next;
        }
         //make the next of ind node tostore in newnode(newhead)
        ListNode newhead=fast1.next;
        //make the Node of ind  to null
        fast1.next=null;
        //traversing the newnode(newhead) to find the end pos which is going to be "prev"
        ListNode temp=newhead;
        ListNode prev=newhead;
        while(temp!=null){
            prev=temp;
            temp=temp.next;
        }
        //connecting the end(prev) of newnode(newhead) to start of intital node which is modified
        prev.next=originalheadof_secondhalf;
        return  newhead;
    }
}

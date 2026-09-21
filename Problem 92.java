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
    public ListNode reverseBetween(ListNode head, int left, int right) {
         if (head == null || left == right) return head;
        ListNode prev=head;
        ListNode beforeprev=null;
        for(int i=1;i<left;i++){
            beforeprev=prev;
            prev=prev.next;

        }
        ListNode temp=prev.next;
         ListNode leftnode = prev;
        ListNode rightnode=prev;
        for(int i=left;i<right;i++)
            rightnode = rightnode.next;
        ListNode afterrightnode=rightnode.next;
          prev.next = null;
        while(prev!=rightnode){
            ListNode val=temp.next;
            temp.next=prev;
            prev=temp;
            temp=val;
        }
        if(beforeprev!=null)beforeprev.next=rightnode;
        else  head = rightnode;
        leftnode.next = afterrightnode;
        return head; 
    }
}

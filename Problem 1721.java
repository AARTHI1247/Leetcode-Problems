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
        int n=1;
        ListNode temp=head;
        ListNode beginningnode=head;
        ListNode endingnode=head;
        while(temp!=null){
            temp=temp.next;
            n++;
        }
        for(int i=1;i<k;i++){
            beginningnode=beginningnode.next;
        }
        for(int i=1;i<n-k;i++){
            endingnode=endingnode.next;
        }
        int temporary=beginningnode.val;
        beginningnode.val=endingnode.val;
        endingnode.val=temporary;
        return head;
    }
}

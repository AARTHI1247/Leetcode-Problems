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
    public ListNode middleNode(ListNode head) {
        if(head==null)return null;
        ListNode temp=head;
        int j=1;
        while(temp!=null){
            temp=temp.next;
            j++;
        }
        int mid=j/2;
        ListNode curr=head;
        if(j%2==0){
        for(int i=1;i<mid;i++){
            curr=curr.next;
        }
        }
        else{
            for(int i=0;i<mid;i++){
            curr=curr.next;
        }
        }
        return curr;
    }
}

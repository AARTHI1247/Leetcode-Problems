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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          ListNode cur1=l1;
          ListNode cur2=l2;
          ListNode temp=null;
          ListNode head=null;
          int c=0,sum=0;
          while(cur1!=null && cur2!=null){
            sum=cur1.val+cur2.val+c;
            if(sum>9){
                c=sum/10;
                sum%=10;
            }
            else c=0;
            ListNode node=new ListNode(sum);
            if(head==null){
                head=node;
                temp=node;
            }
            else{
            temp.next=node;
            temp=temp.next;
            }
            cur1=cur1.next;
            cur2=cur2.next;
          } 
          while(cur1!=null){
            sum=cur1.val+c;
            if(sum>9){
                c=sum/10;
                sum%=10;
            }
            else c=0;
            ListNode node=new ListNode(sum);
            temp.next=node;
            temp=temp.next;
            cur1=cur1.next;
          }
          while(cur2!=null){
            sum=cur2.val+c;
            if(sum>9){
                c=sum/10;
                sum%=10;
            }
            else c=0;
            ListNode node=new ListNode(sum);
            temp.next=node;
            temp=temp.next;
            cur2=cur2.next;
          }
          if(c==1){
            ListNode node=new ListNode(c);
            temp.next=node;
            temp=temp.next;
          } 
          return head;
    }
}

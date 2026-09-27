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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        ListNode curr=head;
        //using hashmap to find the frequency
        HashMap<Integer,Integer>map=new HashMap<>();
        while(curr!=null){
            map.put(curr.val,map.getOrDefault(curr.val,0)+1);
            curr=curr.next;
        }
        //removing the number which has duplicate for refering the unique values using hashset 
        HashSet<Integer> set=new HashSet<>();
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
           if(e.getValue()==1) set.add(e.getKey());
        }
        //finding the unique element for head
        while( head!=null && !set.contains(head.val) ){
            head=head.next;
        }
        //removing the elements which has duplicates
        ListNode cur=head;
        while(cur!=null && cur.next!=null){
            if(!set.contains(cur.next.val)) cur.next=cur.next.next;
            else cur=cur.next;
        }
        return head;
    }
}

public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode curr_i=head;
        ListNode curr_j=head;
        while(curr_j!=null && curr_j.next!=null){
            curr_i=curr_i.next;
            curr_j=curr_j.next.next;
            if(curr_j==curr_i) return true;
            };
        return false;
    }
}

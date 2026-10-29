/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) return null;
        HashMap<Node,Node> map=new  HashMap<>();
        Node temp=head;
        Node newtemp=head;
        Node newhead=new Node(temp.val);
        Node newcurr=newhead;
        map.put(temp,newcurr);
        temp=temp.next;
        while(temp!=null){
            Node curr=new Node(temp.val);
            newcurr.next=curr;
            newcurr=newcurr.next;
            map.put(temp,newcurr);
            temp=temp.next;
        }
        newcurr=newhead;
        while(newcurr!=null){
            newcurr.random=map.get(newtemp.random);
            newtemp=newtemp.next;
            newcurr=newcurr.next;
        }
        return newhead;
    }
}

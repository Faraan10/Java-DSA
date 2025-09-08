package linkedList.singleLinkedList;

class ListNode{

    int val;
    ListNode next;

    ListNode(int x){
        val=x;
        next=null;
    }
}

public class ReverseLinkedList {
    
    public ListNode reverseList(ListNode A) {

        ListNode current=A;
        ListNode previous=null;

        while(current != null){
            ListNode next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        return previous;
    }
}

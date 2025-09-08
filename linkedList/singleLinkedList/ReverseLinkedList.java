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
    
    // TC: O(N) travelling through entire linked list once
    // SC: O(1) only 3 variables used as pointers
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

package linkedList.singleLinkedList;

public class MergeTwoSortedLinkedLists {
    
    public ListNode mergeTwoLists(ListNode A, ListNode B) {

        ListNode head=new ListNode(-1);
        ListNode temp=head; // tail pointer

        while(A!=null && B!=null){
            if(A.val<=B.val){
                temp.next=A;
                A=A.next;
            }else{
                temp.next=B;
                B=B.next;
            }
            temp=temp.next;
        }

        if(A!=null){
            temp.next=A;
        }else{
            temp.next=B;
        }

        return head.next;
    }
}

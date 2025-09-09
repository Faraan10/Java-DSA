package linkedList.singleLinkedList;

public class DeletePositionInLinkedList {
    
    public ListNode solve(ListNode A, int B) {

        ListNode temp=A;

        if(A==null){
            return null;
        }

        if(B==0){
            temp=temp.next;
            return temp;
        }

        temp=A;
        int idx=0;
        while(idx<B-1){
            temp=temp.next;
            idx++;
        }

        if(temp.next!=null){
            temp.next=temp.next.next;
        }
        return A;
    }
}

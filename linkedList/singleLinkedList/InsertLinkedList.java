package linkedList.singleLinkedList;

public class InsertLinkedList {
    
    // TC: O(N)
    // SC: O(1) no extra space used
    public ListNode solve(ListNode A, int B, int C) {

        ListNode temp=A;
        ListNode newNode=new ListNode(B);
        if(C==0){
            newNode.next=temp;
            return newNode;
        }

        if(A==null){
            return newNode;
        }

        int idx=0;
        temp=A;
        while(temp!=null){
            temp=temp.next;
            idx++;
        }
        if(C>=idx){
            temp=A;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
            return A;
        }

        idx=0;
        temp=A;
        while(idx<C-1){
            temp=temp.next;
            idx++;
        }
        newNode.next=temp.next;
        temp.next=newNode;

        return A;
    }
}

package revision;

class ListNode{

    ListNode next;
    int val;
    ListNode(int x){
        val=x;
    }
}

public class InsertLinkedList {
    
    // TC: O(N)
    // SC: O(1)
    public ListNode solve(ListNode A, int B, int C) {

        ListNode newNode=new ListNode(B);
        ListNode temp=A;
        if(A==null || C==0){
            newNode.next=temp;
            return newNode;
        }

        int count=0;
        temp=A;
        while(temp.next != null && count<C-1){
            temp=temp.next;
            count++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        return A;
    }
}

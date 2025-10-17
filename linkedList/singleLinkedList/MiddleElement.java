package linkedList.singleLinkedList;


class ListNode{

    int x;
    ListNode next;

    ListNode(int val){
        x=val;
        next=null;
    }
}

public class MiddleElement {

    // TC: O(A) as calculating size
    // SC: O(1)
    // Note: for even element we are taking the first occurence of middle element
    // for ex: [2,5,4,3] here we have two elements in middle so we are taking 
    // first here depends on problem constraints and 
    public static int solve(ListNode A){

        if(A==null){
            return 0;
        }

        ListNode temp=A;
        int size=0;

        while(temp!=null){
            temp=temp.next;
            size++;
        }

        temp=A;
        if(size%2==0){
            for(int i=0; i<(size/2)-1; i++){
                temp=temp.next;
            }
            return temp.x;
        }else{
            for(int i=0; i<(size/2); i++){
                temp=temp.next;
            }
            return temp.x;
        }
    }
    
}

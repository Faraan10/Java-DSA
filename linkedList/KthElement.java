package linkedList;


class ListNode{
    public int val;
    public ListNode next;

    ListNode(int x){
        val = x; 
        next = null; 
    }
}

public class KthElement {
    
    public int solve(ListNode A, int B) {

        ListNode temp=A;
        int index=0;

        while(temp != null){
            if(index==B){
                return temp.val;
            }
            temp=temp.next;
            index++;
        }
        return -1;
    }
}

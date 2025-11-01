package linkedList.singleLinkedList;

public class RemoveDuplicatesInSortedList {
    
    // TC: O(N)
    // SC: O(1)
    public ListNode deleteDuplicates(ListNode A) {

        if(A==null){
            return A;
        }

        ListNode temp=A;

        while(temp.next != null){
            if(temp.val==temp.next.val){
                temp.next=temp.next.next;
            }else{
                temp=temp.next;
            }
        }
        return A;
    }
}

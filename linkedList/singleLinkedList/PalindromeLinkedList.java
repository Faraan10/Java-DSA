package linkedList.singleLinkedList;

public class PalindromeLinkedList {
    
    public static ListNode middleElement(ListNode A){

        ListNode slow=A;
        ListNode fast=A;

        while(fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

    public int lPalin(ListNode A) {

        ListNode mid=middleElement(A);
        ListNode l1=A;
        ListNode l2=mid.next;
        mid.next=null;

        ListNode previous=null;
        ListNode current=l2;

        while(current != null){
            ListNode next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }

        l2=previous; 

        while(l1 != null && l2 != null){
            if(l1.val != l2.val){
                return 0;
            }else{
                l1=l1.next;
                l2=l2.next;
            }
        }
        return 1;
    }
}

package linkedList.singleLinkedList;

public class sortLinkedList {
    
    public static ListNode middleEle(ListNode A){

        ListNode slow=A;
        ListNode fast=A;

        while(fast.next != null && fast.next.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public static ListNode sortTwoLinkedLists(ListNode A, ListNode B){

        ListNode head=new ListNode(-1);
        ListNode temp=head;
        ListNode t1=A;
        ListNode t2=B;

        while(t1 != null && t2!= null){
            if(t1.val<=t2.val){
                temp.next=t1;
                t1=t1.next;
                temp=temp.next;
            }else{
                temp.next=t2;
                t2=t2.next;
                temp=temp.next;
            }
        }
        if(t1 != null){
            temp.next=t1;
        }else{
            temp.next=t2;
        }
        return head.next;
    }

    
    public ListNode sortList(ListNode A) {

        if(A==null || A.next==null){
            return A;
        }

        ListNode mid=middleEle(A);
        ListNode list1=A;
        ListNode list2=mid.next;
        mid.next=null;
        list1=sortList(list1);
        list2=sortList(list2);
        return sortTwoLinkedLists(list1, list2);
    }
}

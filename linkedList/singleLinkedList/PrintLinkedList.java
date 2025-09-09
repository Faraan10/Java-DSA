package linkedList.singleLinkedList;

// this below class I am creating a linked list class which can be used below in the method
// class ListNode{

//     public int val;
//     public ListNode next;

//     ListNode(int x){
//         val=x;
//         next=null;
//     }
// }
public class PrintLinkedList {
    
    public void printList(ListNode A){

        while(A!=null){
            System.out.print(A.val+" ");
            A=A.next;
        }
        System.out.println();
    }
}

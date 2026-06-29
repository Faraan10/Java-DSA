package heaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class MergeKSortedLists {

    class ListNode {
       public int val;
       public ListNode next;
       ListNode(int x) { val = x; next = null; }
    }
    
    public ListNode mergeKLists(ArrayList<ListNode> a) {

        PriorityQueue<ListNode> heap=new PriorityQueue<>((x,y)-> x.val-y.val);
        ListNode head=new ListNode(-1);
        ListNode res=head;

        for(int i=0; i<a.size(); i++){
            heap.add(a.get(i));
        }

        while(!heap.isEmpty()){
            ListNode curr=heap.poll();
            if(curr.next != null){
                heap.add(curr.next);
            }
            res.next=curr;
            res=res.next;
        }
        return head.next;
	}
}

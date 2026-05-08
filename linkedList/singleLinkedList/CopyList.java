package linkedList.singleLinkedList;

public class CopyList {

    class RandomListNode{

        int label;
        RandomListNode next;
        RandomListNode random;

        RandomListNode(int x){
            this.label=x;
        }
    }
    
    public RandomListNode copyRandomList(RandomListNode head) {

        if (head == null) return null;

        // Step 1: Create interleaved copied nodes
        RandomListNode curr = head;
        while (curr != null) {
            RandomListNode copy = new RandomListNode(curr.label);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }

        // Step 2: Assign random pointers to copied nodes
        curr = head;
        while (curr != null) {
            if (curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        // Step 3: Separate original and copied lists
        curr = head;
        RandomListNode dummy = new RandomListNode(0);
        RandomListNode copyCurr = dummy;
        while (curr != null) {
            copyCurr.next = curr.next;
            curr.next = curr.next.next;

            curr = curr.next;
            copyCurr = copyCurr.next;
        }

        return dummy.next;
        
    }
}

package linkedList.singleLinkedList;

public class KReverseLinkedList {
    
    // TC: O(N)
    // SC: O(1)
    public ListNode reverseList(ListNode A, int B) {

        ListNode current = A;
        ListNode prevGroupTail = null;
        ListNode resultHead = null;

        while (current != null) {

            ListNode groupHead = current;
            ListNode prev = null;
            int count = 0;

            // Reverse B nodes
            while (current != null && count < B) {

                ListNode newNode = current.next;
                current.next = prev;
                prev = current;
                current = newNode;

                count++;
            }

            // First group
            if (resultHead == null) {
                resultHead = prev;
            }

            // Connect previous group to current group
            if (prevGroupTail != null) {
                prevGroupTail.next = prev;
            }

            // groupHead is now the tail of this reversed group
            prevGroupTail = groupHead;
        }

        return resultHead;
    }
}

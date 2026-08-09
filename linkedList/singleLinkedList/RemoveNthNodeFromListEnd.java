package linkedList.singleLinkedList;

public class RemoveNthNodeFromListEnd {
    
    // TC: O(N)
    // SC: O(1)
    public ListNode removeNthFromEnd(ListNode A, int B) {

        ListNode fast = A;
        ListNode slow = A;

        // Move fast B nodes ahead
        for (int i = 0; i < B; i++) {

            // B > length
            if (fast == null) {
                return A.next;
            }

            fast = fast.next;
        }

        // If B == length
        // fast is null, so remove head
        if (fast == null) {
            return A.next;
        }

        // Move both pointers
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Delete B-th node from end
        slow.next = slow.next.next;

        return A;
    }
}

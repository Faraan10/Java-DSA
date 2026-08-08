package linkedList.singleLinkedList;

public class ReverseLinkedList2 {
    
    // TC: O(N)
    // SC: O(1)
    public ListNode reverseBetween(ListNode A, int B, int C) {

        // If nothing needs to be reversed
    if (B == C) {
        return A;
    }

    ListNode prev = null;
    ListNode curr = A;

    // Move curr to position B
    for (int i = 1; i < B; i++) {
        prev = curr;
        curr = curr.next;
    }

    // prev = node before B
    // curr = node at B

    ListNode before = prev;
    ListNode tail = curr;

    // Reverse from B to C
    ListNode next = null;

    for (int i = B; i <= C; i++) {
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }

    // prev is now the new head of reversed portion
    // curr is node after C

    // Connect node before B to new head
    if (before != null) {
        before.next = prev;
    } else {
        A = prev;
    }

    // Connect old B (now tail) to node after C
    tail.next = curr;

    return A;
    }
}

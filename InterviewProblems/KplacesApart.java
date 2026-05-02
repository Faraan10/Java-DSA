package InterviewProblems;

import java.util.PriorityQueue;

public class KplacesApart {
    
    // TC: O(N)
    // SSC: O(N)
    public int[] solve(int[] A, int B) {

         int n = A.length;
        int[] result = new int[n];

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Step 1: add first B+1 elements
        for (int i = 0; i <= Math.min(B, n - 1); i++) {
            minHeap.add(A[i]);
        }

        int index = 0;

        // Step 2: process remaining elements
        for (int i = B + 1; i < n; i++) {
            result[index++] = minHeap.poll();
            minHeap.add(A[i]);
        }

        // Step 3: empty remaining heap
        while (!minHeap.isEmpty()) {
            result[index++] = minHeap.poll();
        }

        return result;
    }
}

package heaps;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class HeapQueries {
    
    // TC: O(N log N)
    // SC: O(N)
    public int[] solve(int[][] A) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            int P = A[i][0];
            int Q = A[i][1];

            if (P == 2) {
                // Insert operation
                minHeap.offer(Q);
            } else {
                // Extract min operation
                if (minHeap.isEmpty()) {
                    result.add(-1);
                } else {
                    result.add(minHeap.poll());
                }
            }
        }

        // Convert ArrayList to int[]
        int[] ans = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}

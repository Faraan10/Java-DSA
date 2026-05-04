package InterviewProblems;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRooms2 {
    
    // TC: O(N log N)
    // SC: O(N)
    public int solve(int A, int[][] B) {

        // Sort by start time
        Arrays.sort(B, (a, b) -> a[0] - b[0]);
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for (int i = 0; i < A; i++) {
            
            // Free room if possible
            if (!minHeap.isEmpty() && B[i][0] >= minHeap.peek()) {
                minHeap.poll();
            }
            
            // Allocate room
            minHeap.add(B[i][1]);
        }
        
        return minHeap.size();
    }
}

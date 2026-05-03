package InterviewProblems;

import java.util.Arrays;
import java.util.PriorityQueue;

public class JobSchedulingWithDeadlines {
    
    // TC: O(N log N)
    // SC: O(N log N)
    public int solve(int[] A, int[] B) {

        int n = A.length;
        
        int[][] jobs = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            jobs[i][0] = A[i]; // deadline
            jobs[i][1] = B[i]; // profit
        }
        
        // Sort by deadline
        Arrays.sort(jobs, (a, b) -> a[0] - b[0]);
        
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for (int i = 0; i < n; i++) {
            minHeap.add(jobs[i][1]);
            
            if (minHeap.size() > jobs[i][0]) {
                minHeap.poll(); // remove smallest profit
            }
        }
        
        long totalProfit = 0;
        int mod = 1000000007;
        
        while (!minHeap.isEmpty()) {
            totalProfit = (totalProfit + minHeap.poll()) % mod;
        }
        
        return (int) totalProfit;
    }
}

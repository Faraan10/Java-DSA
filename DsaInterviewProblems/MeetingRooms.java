package DsaInterviewProblems;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MeetingRooms {
    
    // This is a optimized approach problem solved using minheap
    // TC: O(N log N)
    // SC: O(N) worst case
    public int solve(int A, int[][] B) {

        Arrays.sort(B, (x,y)-> Integer.compare(x[0], y[0])); // sorting based on 
        // start times
        
        if(A==0){
            return 0;
        }
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(B[0][1]); // adding first end time into heap
        for(int i=1; i<A; i++){
            int start=B[i][0];
            int end=B[i][1];

            if(start>=pq.peek()){
                pq.poll();
                pq.add(end);
            }else{
                pq.add(end);
            }
        }
        return pq.size();
    }
}

package DsaInterviewProblems;

import java.util.PriorityQueue;

public class KPlacesApart {
    

    // Problem Description

    // N people having different priorities are standing in a queue.

    // The queue follows the property that each person is standing at
    //  most B places away from its position in the sorted queue.

    // Your task is to sort the queue in the increasing order of 
    // priorities.

    // NOTE:

    // No two persons can have the same priority.
    // Use the property of the queue to sort the queue with 
    // complexity O(NlogB).


    // solved this using min heap approach 
    // TC: O(N log B)
    // SC: O(N)
    public int[] solve(int[] A, int B) {

        int N=A.length;
        int[] arr=new int[N];
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0; i<B+1; i++){
            pq.add(A[i]);
        }   
        arr[0]=pq.poll(); // as per constraint the smallest element will atmost be
        // B places apart so added till B elements and adding it to result array
        // through min heap

        int idx=1;
        for(int i=B+1; i<N; i++){
            pq.add(A[i]);
            arr[idx++]=pq.poll();
        }
        while(!pq.isEmpty()){
            arr[idx++]=pq.poll();
        }
        return arr;
    }
}

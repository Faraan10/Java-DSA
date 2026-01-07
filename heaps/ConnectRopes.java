package heaps;

import java.util.PriorityQueue;

public class ConnectRopes {
    
    // TC: O(N * log N)
    // SC: O(N)
    public int solve(int[] A) {

        int N=A.length;
        // priority queue by natural ordering gives back smallest element when
        // peeking element or when removing but the priority queue is not sorted 
        // we can write as below to get the smallest element first or 
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        // we can write explicitly to but it follows returing smallest 
        // PriorityQueue<Integer> pqex=new PriorityQueue<>((a,b)-> Integer.compare(a,b));

        // If we want to return the largest element first then we have to 
        // specify explictly 
        // PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        // or
        // PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)-> Integer.compare(b, a));
        for(int i=0; i<N; i++){
            pq.add(A[i]);
        }

        int sum=0;
        while(pq.size()>1){
            int rope1=pq.remove();
            int rope2=pq.remove();
            sum+=rope1+rope2;
            pq.add(rope1+rope2);
        }
        return sum;
    }
}

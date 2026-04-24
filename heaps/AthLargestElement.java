package heaps;

import java.util.PriorityQueue;

public class AthLargestElement {
    

    // TC: O(N log A)
    // SC: O(A)
    public int[] solve(int A, int[] B) {

        int N=B.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        int[] arr=new int[N];

        for(int i=0; i<A; i++){
            pq.add(B[i]);
            if(i<A-1){
                arr[i]=-1;
            }
        }
        arr[A-1]=pq.peek();

        for(int i=A; i<N; i++){
            if(pq.peek()<B[i]){
                pq.poll();
                pq.add(B[i]);
            }
            arr[i]=pq.peek();
        }
        return arr;
    }
}

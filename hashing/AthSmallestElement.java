package hashing;

import java.util.PriorityQueue;

public class AthSmallestElement {
    
    // TC: O(N log A)
    // SC: O(A)
    public int[] solve(int A, int[] B) {

        int N=B.length;
        int[] arr=new int[N];
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int i=0; i<A-1; i++){
            arr[i]=-1;
            pq.add(B[i]);
        }
        pq.add(B[A-1]);
        arr[A-1]=pq.peek();

        for(int i=A; i<N; i++){
            if(B[i]>pq.peek()){
                pq.poll();
                pq.add(B[i]);
            }
            arr[i]=pq.peek();
        }
        return arr;
    }
}

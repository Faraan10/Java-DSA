package heaps;

import java.util.PriorityQueue;

public class ConnectRopes {
    
    public int solve(int[] A) {

        int N=A.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>();

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

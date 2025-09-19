package queues;

import java.util.Deque;
import java.util.LinkedList;

public class ParkingIcecreamTruck {
    
    public int[] slidingMaximum(final int[] A, int B) {

        int N=A.length;
        int[] arr=new int[N-B+1]; // output array ex: Id array size is N=9 and B=6 then N-B+1 = 9-6+1 = 4
        Deque<Integer> dq=new LinkedList<>();

        if(B>N){
            int[] maxEle=new int[1];
            int max=-1;
            for(int i=0; i<N; i++){
                max=Math.max(A[i], max);
            }
            maxEle[0]=max;
            return maxEle;
        }

        for(int i=0; i<N; i++){
            while(!dq.isEmpty() && A[dq.getLast()]<= A[i]){
                dq.removeLast();
            }
            dq.addLast(i);

            if(!dq.isEmpty() && dq.getFirst()<=i-B){
                dq.removeFirst();
            }

            if(i>=B-1){
                arr[i-B+1]=A[dq.getFirst()];
            }
        }
        return arr;
    }
}

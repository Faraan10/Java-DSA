package queues;

import java.util.Deque;
import java.util.LinkedList;

public class ParkingIcecreamTruck {
    
    // TC: O(N)
    // SC: O(B) we are storing B length elements n the array
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


    // TC: O(N)
    // SC: O(N)

    // another good way solving this problem same but using while loop
    // below first inital loop to make it more easy to understand
    public int[] differentApproachSlidingMaximum(final int[] A, int B) {

        int N=A.length;
        Deque<Integer> dq=new LinkedList<>();
        int[] arr=new int[N-B+1]; // this will be length of the array

        for(int i=0; i<B; i++){

            while(!dq.isEmpty() && A[dq.getLast()]<=A[i]){
                dq.removeLast();
            }
            dq.addLast(i);
        }

        int i=1;
        int j=B;
        int idx=0;
        while(j<N){

            arr[idx]=A[dq.getFirst()];
            idx++;

            if(!dq.isEmpty() && dq.getFirst()<i){
                dq.removeFirst();
            }

            while(!dq.isEmpty() && A[dq.getLast()]<=A[j]){
                dq.removeLast();
            }
            dq.addLast(j);

            i++;
            j++;
        }
        arr[idx]=A[dq.getFirst()];

        return arr;
    }
}

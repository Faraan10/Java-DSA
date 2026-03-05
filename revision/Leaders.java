package revision;

import java.util.ArrayList;

public class Leaders {
    
    // TC: O(N)
    // SC: O(M) which is no of leaders in the array
    public int[] solve(int[] A) {

        int N=A.length;

        ArrayList<Integer> list=new ArrayList<>();
        list.add(A[N-1]);
        int max=A[N-1];
        for(int i=N-2; i>=0; i--){
            if(A[i]>max){
                list.add(A[i]);
                max=A[i];
            }
        }

        int[] arr=new int[list.size()];
        int M=arr.length;
        for(int i=0; i<M; i++){
            arr[i]=list.get(M-i-1);
        }
        return arr;
    }
}

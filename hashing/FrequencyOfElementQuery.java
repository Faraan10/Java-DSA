package hashing;

import java.util.HashMap;

public class FrequencyOfElementQuery {
    
    // TC: O(A+B)
    // SC: O(A)
    public int[] solve(int[] A, int[] B) {

        HashMap<Integer, Integer> hm=new HashMap<>();
        int N=A.length;

        for(int i=0; i<N; i++){
            if(hm.containsKey(A[i])){
                hm.put(A[i], hm.getOrDefault(A[i], 0)+1);
                // no need of above if statement and below else statement as the above line handles both cases
            }else{
                hm.put(A[i], 1);
            }
        }

        int M=B.length;
        int[] arr=new int[M];
        for(int i=0; i<M; i++){
            if(hm.containsKey(B[i])){
                arr[i]=hm.get(B[i]);
            }
        }
        return arr;
    }
}

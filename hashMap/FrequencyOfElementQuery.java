package hashMap;

import java.util.HashMap;

public class FrequencyOfElementQuery {

    // TC: O(N) only one single loop 
    // SC: O(N) using HashMap so O(N)
    public int[] solve(int[] A, int[] B) {

        int N=A.length;
        HashMap<Integer, Integer> hm=new HashMap<Integer, Integer>();

        for(int i=0; i<N; i++){
            if(hm.containsKey(A[i])){
                int value=hm.get(A[i]);
                int newValue=value+1;
                hm.put(A[i], newValue);
            }else{
                hm.put(A[i], 1);
            }
        }
        
        int[] arr=new int[B.length];

        for(int i=0; i<arr.length; i++){
            if(hm.containsKey(B[i])){
                arr[i]=hm.get(B[i]);
            }else{
                arr[i]=0;
            }
        }
        return arr;
    }
}

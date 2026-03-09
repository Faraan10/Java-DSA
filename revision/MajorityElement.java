package revision;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {
    
    // TC: O(N) iteration till N once
    // SC: O(N) using hashmap
    public int majorityUsingHashMap(final int[] A){

        int N=A.length;
        HashMap<Integer, Integer> hm=new HashMap<>();

        for(int i=0; i<N; i++){
            hm.put(A[i], hm.getOrDefault(A[i], 0)+1);
        }

        int majority=N/2;
        for(int i=0; i<N; i++){
            if(hm.get(A[i])>majority){
                return A[i];
            }
        }
        return 0;
    }


    // TC: O(N log N) sorting arrays using Arrays.sort() method
    // SC: O(1)
    public int majorityUsingSorting(final int[] A){

        int N=A.length;
        int count=1;
        int majority=N/2;

        Arrays.sort(A);
        // if(N==1){
        //     return A[0];
        // }

        for(int i=1; i<N; i++){
            if(A[i-1]==A[i]){
                count++;
            }else{
                count=1;
            }
            if(count>majority){
                return A[i];
            }
        }
        return A[0];
    }
}

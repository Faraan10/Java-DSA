package ImportantQuestions;

import java.util.HashMap;

public class MajorityElement {
    
    // TC: O(N)
    // SC: O(N) using hashmap
    public int majorityElement(final int[] A) {

        HashMap<Integer, Integer> hm=new HashMap<>();
        int N=A.length;

        for(int i=0; i<N; i++){
            if(hm.containsKey(A[i])){
                int value=hm.get(A[i]);
                int newVal=value+1;
                hm.put(A[i], newVal);
            }else{
                hm.put(A[i], 1);
            }
        }
    
        for(int i=0; i<N; i++){
            if(hm.get(A[i])>N/2){
                return A[i];
            }
        }
        return 0;
    }
}

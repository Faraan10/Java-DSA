package hashMap;

import java.util.HashMap;

public class CheckPairSum {
    
    // TC: O(B)
    // SC: O(B) worst case as we are using hashmap
    public int solve(int A, int[] B) {

        HashMap<Integer, Integer> hm=new HashMap<>();
        int N=B.length;

        for(int i=0; i<N; i++){
            if(hm.containsKey(A-B[i])){
                return 1;
            }else{
                hm.put(B[i], 1);
            }
        }
        return 0;
    }
}

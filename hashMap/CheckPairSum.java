package hashMap;

import java.util.HashMap;

public class CheckPairSum {
    
    
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

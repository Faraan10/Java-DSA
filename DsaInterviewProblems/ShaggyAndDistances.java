package DsaInterviewProblems;

import java.util.HashMap;

public class ShaggyAndDistances {
    
    // Implemented using hashmap method
    // TC: O(N)
    // SC: O(N)
    public int solve(int[] A) {

        int N=A.length;
        HashMap<Integer, Integer> hm=new HashMap<>();
        int ans=Integer.MAX_VALUE;

        for(int i=0; i<N; i++){
            if(hm.containsKey(A[i])){
                ans=Math.min(ans, i-hm.get(A[i]));
            }
            hm.put(A[i], i);
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}

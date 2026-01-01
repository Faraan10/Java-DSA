package hashing;

import java.util.HashMap;

public class COuntSubarrayZeroSum {
    
    public int solve(int[] A) {

        HashMap<Integer, Integer> hm=new HashMap<>();

        int N=A.length;
        int mod=1000000007;
        hm.put(0, 1);
        
        for(int i=1; i<N; i++){
            A[i]=A[i-1]+A[i];
        }

        int count=0;
        for(int i=0; i<N; i++){
            if(hm.containsKey(A[i])){
                count=((count%mod)+(hm.get(A[i])%mod))%mod;
            }
            hm.put(A[i], hm.getOrDefault(A[i], 0)+1);
        }
        return count%mod;
    }
}

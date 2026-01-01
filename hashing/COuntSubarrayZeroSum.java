package hashing;

import java.util.HashMap;

public class CountSubarrayZeroSum {
    
    
    // TC: O(N)
    // SC: O(N)
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
                count=((count%mod)+(hm.get(A[i])%mod))%mod; // here using mod formula 
                // (a+b)%m = ((a%m)+(b%m))%m so that the count will not overflow and stay within limits as per the constraints
            }
            hm.put(A[i], hm.getOrDefault(A[i], 0)+1);
        }
        return count%mod;
    }
}

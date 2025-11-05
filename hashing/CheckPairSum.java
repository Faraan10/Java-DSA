package hashing;

import java.util.HashSet;

public class CheckPairSum {
    
    // TC: O(N)
    // SC: O(N) hashset
    public int solve(int A, int[] B) {

        HashSet<Integer> hs=new HashSet<>();
        int N=B.length;

        for(int i=0; i<N; i++){
            if(hs.contains(A-B[i])){
                return 1;
            }
            hs.add(B[i]);
        }
        return 0;
    }
}

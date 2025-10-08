package maths;

import java.util.HashSet;

public class checkpairSum {
    
    // TC: O(N)
    // SC: O(N)
    public int solve(int A, int[] B) {

        HashSet<Integer> hs=new HashSet<>();
        int N=B.length;


        for(int i=0; i<N; i++){
            if(hs.contains(A-B[i])){
                return 1;
            }else{
                hs.add(B[i]);
            }
        }
        return 0;
    }
}

package hashing;

import java.util.HashSet;

public class FirstRepeatingElement {

    // TC: O(N)
    // SC: O(1)
    public int solve(int[] A) {

        int N=A.length;
        int ans=-1;
        HashSet<Integer> hs=new HashSet<>();

        for(int i=N-1; i>=0; i--){
            if(hs.contains(A[i])){
                ans=A[i];
            }
            hs.add(A[i]);
        }
        return ans;
    }
}

package AbasicProblemsList;

import java.util.Arrays;

public class NobleIntegers {
    
    // TC: O(N log N)
    // SC: O(1)
    public int solve(int[] A) {

        int N=A.length;
        Arrays.sort(A);

        for(int i=0; i<N; i++){

            while(i+1<N && A[i]==A[i+1]){
                i++;
            }
            if(A[i]==N-i-1){
                return 1;
            }
        }
        return -1;
    }
}

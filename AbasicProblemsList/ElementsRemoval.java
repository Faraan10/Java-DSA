package AbasicProblemsList;

import java.util.Arrays;

public class ElementsRemoval {
    
    // TC: O(N log N)
    // SC: O(1)
    public int solve(int[] A) {

        int N=A.length;
        Arrays.sort(A);
        int sum=0;

        // for(int i=N-1; i>=0; i--){
        //     for(int j=i; j>=0; j--){
        //         sum+=A[j];
        //     }
        // }
        // return sum;

        for(int i=0; i<N; i++){
            sum=sum+((i+1)*A[N-i-1]);
        }
        return sum;
    }
}

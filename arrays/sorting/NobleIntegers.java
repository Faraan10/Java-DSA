package arrays.sorting;

import java.util.Arrays;

public class NobleIntegers {

    // TC: O(N^2)
    // SC: O(1)
    public int bruteForce(int[] A){
        Arrays.sort(A);
        int N=A.length;
        for(int i=0; i<N; i++){
            int count=0;
            for(int j=i+1; j<N; j++){
                if(A[i]<A[j]){
                    count++;
                }
            }
            if(count==A[i]){
                return 1;
            }
        }
        return -1;
    }
    
    // TC: O(N log N)
    // SC: O(1)
    // handles both positive and negative values
    public int solve(int[] A) {

        int N=A.length;
        Arrays.sort(A);

        for(int i=0; i<N; i++){
            // skipping duplicates
            while(i+1<N && A[i]==A[i+1]){
                i++;
            }

            if(N-i-1 == A[i]){
                return 1;
            }
        }
        return -1;
    }
}

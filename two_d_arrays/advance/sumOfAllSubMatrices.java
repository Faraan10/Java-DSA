package two_d_arrays.advance;

public class sumOfAllSubMatrices {
    
    // TC: O(N^3 * M^3)
    // SC: O(1)
    public int solve(int[][] A) {

        int N=A.length;
        int M=A[0].length;
        int sum=0;

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                for(int k=i; k<N; k++){
                    for(int l=j; l<M; l++){
                        
                        for(int x=i; x<=k; x++){
                            for(int y=j; y<=l; y++){
                                sum+=A[x][y];
                            }
                        }
                    }
                }
            }
        }
        return sum;
    }

    
}

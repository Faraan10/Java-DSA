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


    // TC: O(N*M)
    // SC: O(1)
    public int optimizedSolve(int[][] A) {

        int N=A.length;
        int M=A[0].length;
        long sum=0;

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                long topLeft=(long)(i+1)*(j+1);
                long bottomRight=(long)(N-i)*(M-j);
                sum+=A[i][j]*topLeft*bottomRight;
            }
        }
        return (int)sum;
    }
}

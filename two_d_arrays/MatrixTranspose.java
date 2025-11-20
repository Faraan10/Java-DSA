package two_d_arrays;

public class MatrixTranspose {
    
    // TC: O(M*N)
    // SC: O(1)
    public int[][] solve(int[][] A) {

        int N=A.length;
        int M=A[0].length;
        int[][] mat=new int[M][N];

        for(int i=0; i<M; i++){
            for(int j=0; j<N; j++){
                mat[i][j]=A[j][i];
            }
        }
        return mat;
    }
}

package BinarySearch;

public class MatrixSearch {
    
    // TC: O(N*M) i loop till N-1 and j loop till M-1 N*M
    // SC: O(1)
    // bruteforce approach
    public int searchMatrix(int[][] A, int B) {

        int N=A.length;
        int M=A[0].length;

        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                if(A[i][j]==B){
                    return 1;
                }
            }
        }
        return 0;
    }
}

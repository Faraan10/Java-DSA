package BinarySearch;

public class MatrixSearch {
    
    // TC: O(N*M) i loop till N-1 and j loop till M-1 N*M
    // SC: O(1)
    // bruteforce approach
    // public int searchMatrix(int[][] A, int B) {

    //     int N=A.length;
    //     int M=A[0].length;

    //     for(int i=0; i<N; i++){
    //         for(int j=0; j<M; j++){
    //             if(A[i][j]==B){
    //                 return 1;
    //             }
    //         }
    //     }
    //     return 0;
    // }

    // TC: O(N)
    // SC: O(1)
    // optimized method only can be used when the matrix is sorted
    // public int searchMatrix(int[][] A, int B) {

    //     int N=A.length;
    //     int M=A[0].length;

    //     int i=0;
    //     int j=M-1;
    //     while(i<N && j>=0){
    //         if(A[i][j]==B){
    //             return 1;
    //         }else if(A[i][j]<B){
    //             i++;
    //         }else{
    //             j--;
    //         }
    //     }
    //     return 0;
    // }
}

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

    // Most optimized approach using binary search when matrix is sorted
    // TC: O(log N*M) as we are flattening the array out and traversing by dividing the array using binarysearch 
    // SC: O(1)
    public int searchMatrix(int[][] A, int B) {

        int N=A.length;
        int M=A[0].length;

        int low=0;
        int high=N*M-1;

        while(low<=high){

            int mid=low+(high-low)/2;

            int row=mid/M;
            int col=mid%M;
            if(A[row][col]==B){
                return 1;
            }else if(A[row][col]<B){
                low=mid+1;
            }else{
                high=mid-1;
            }
        }
        return 0;
    }
}

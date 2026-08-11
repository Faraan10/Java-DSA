package AllBasicProblemsList.BinarySearch;

public class MatrixSearch {
    
    // TC: O(log N)
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

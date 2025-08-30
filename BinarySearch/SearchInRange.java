package BinarySearch;

public class SearchInRange {
    // Bruteforce method
    // TC: O(N)
    // SC: O(1)
    public int[] searchRange(final int[] A, int B) {

        int N=A.length;
        int leftMost=-1;
        int rightMost=-1;
        for(int i=0; i<N; i++){
            if(A[i]==B){
                rightMost=i;
            }
        }

        for(int i=N-1; i>=0; i--){
            if(A[i]==B){
                leftMost=i;
            }
        }

        return new int[] {leftMost, rightMost};
    }
}

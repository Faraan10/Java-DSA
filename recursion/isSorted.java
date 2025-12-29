package recursion;

public class isSorted {
    
    // TC: O(A)
    // SC: O(A) 
    public boolean isItSorted(int[] A, int idx) {

        if(idx==A.length-1){
            return true;
        }

        if(A[idx]>A[idx+1]){
            return false;
        }

        return isItSorted(A, idx+1);
    } 
}

package BinarySearch;

public class PeakElement {

        
    // TC: O(logN)
    // SC: O(1)
    public int solve(int[] A) {
        
        int low=0;
        int high=A.length-1;

        if(A.length==1){
            return A[0];
        }

        if(A[low]>=A[low+1]){
            return A[low];
        }

        if(A[high]>=A[high-1]){
            return A[high];
        }

        while(low<=high){

            int mid=low+(high-low)/2;

            if(mid>0 && mid<A.length-1){
                if(A[mid-1]<=A[mid] && A[mid]>=A[mid+1]){
                    return A[mid];
                }else if(A[mid-1]<=A[mid] && A[mid]<=A[mid+1]){
                    low=mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
}

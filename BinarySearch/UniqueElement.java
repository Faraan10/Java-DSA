package BinarySearch;

public class UniqueElement {
    
    // TC: O(logN)
    // SC: O(1)
    public int solve(int[] A) {

        int low=0;
        int high=A.length-1;

        while(low<=high){

            int mid=low+(high-low)/2;

            boolean left_Matches=(mid>0 && A[mid-1]==A[mid]);
            boolean right_matches=(mid<A.length-1 && A[mid+1]==A[mid]);

             // At the answer
            if(!left_Matches && !right_matches){
                return A[mid];
            }
            // Take mid to the first occurrence of this value A[mid]
            if(left_Matches){
                mid=mid-1;
            }
            // If first occurrence is at even position, then move to right
            if(mid%2==0){
                // Move after (mid+1) because (mid+1) has the same value as index mid
                low=mid+2;
            // If first occurrence is at odd position, then move to left
            }else{
                high=mid-1;
            }
        }
        return -1;
    }
}

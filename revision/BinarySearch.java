package revision;
import java.util.*;

public class BinarySearch {

    
    // finding this key k in the array
    // TC: O(log N)
    // SC: O(1)
    public int binarySearchProblem(int[] A, int K){
        
        // A= [1,2,3,4,5,6,7,8]
        // K= 2

        int low=0;
        int high=A.length-1;
        Arrays.sort(A);

        while(low<=high){

            int mid=low+(high-low)/2;

            if(A[mid]==K){
                return 1;
            }else if(A[mid]>K){
                high=mid-1; // high=2
            }else{
                low=mid+1;
            }
        }
        return 0;
    }
}

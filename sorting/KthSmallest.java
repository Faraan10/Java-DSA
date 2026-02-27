package sorting;

import java.util.Arrays;

public class KthSmallest {
    
    // TC: O(N*B)
    // SC: O(1)
    // This method is partial selection sort till B elements as you can see
    // in first loop we are storing first B smaller elements in the array 
    // and return A[B-1] element
    public int kthsmallest(final int[] A, int B) {

        for(int i=0; i<B; i++){
            int min=Integer.MAX_VALUE; 
            int idx=0;
            for(int j=i; j<A.length; j++){
                if(A[j]<min){
                    min=A[j];
                    idx=j;
                }
            }
            int temp=A[i];
            A[i]=A[idx];
            A[idx]=temp;
        }
        return A[B-1];
    }

    // TC: O(N log N)
    // SC: O(1)
    public int kthsmallestInBuiltSorting(final int[] A, int B) {

        Arrays.sort(A);

        return A[B-1];
    }
}

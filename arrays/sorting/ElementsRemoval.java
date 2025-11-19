package arrays.sorting;

import java.util.Arrays;

public class ElementsRemoval {
    

    // problem description
    // The cost of this operation is the sum of all elements in the array present before this operation.
    // Find the minimum cost to remove all elements from the array.
    
    // TC: O(N^2)
    // SC: O(1)
    // note: if we remove the largest element first and so on we will get the 
    // minimum cost as we will be removing maximum elements first
    public int solve(int[] A) {

       int N=A.length;
       Arrays.sort(A);
       int cost=0;

       for(int i=N-1; i>=0; i--){
           for(int j=N-i-1; j>=0; j--){
               cost+=A[j];
           }
       }        
       return cost;
    }
}

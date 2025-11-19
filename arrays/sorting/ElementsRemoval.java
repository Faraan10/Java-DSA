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


    // using prefix sum
    // TC: O(N log N)
    // SC: O(N)

    public int prefixSolve(int[] A) {

       int N=A.length;
       Arrays.sort(A);

       int[] pf=new int[N];
       pf[0]=A[0];
       for(int i=1; i<N; i++){
           pf[i]=pf[i-1]+A[i];
       }

       int sum=0;
       for(int i=0; i<N; i++){
           sum+=pf[i];
       }
       return sum;
    }



    // TC: O(N)
    // SC: O(1)
    // using the index ( (N-i) represents the no of times element in counted 
    // in array *A[i]) and add it to sum

    public int optimizedSolve(int[] A) {

        int N=A.length;
        Arrays.sort(A);
        int ans=0;

        for(int i=N-1; i>=0; i--){
            ans=ans+((N-i)*A[i]);
        }
        return ans;
    }

}

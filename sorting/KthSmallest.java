package sorting;

public class KthSmallest {
    
    // TC: O(N*B)
    // SC: O(N)
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
}

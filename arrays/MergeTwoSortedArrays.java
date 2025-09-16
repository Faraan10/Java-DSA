package arrays;

public class MergeTwoSortedArrays {
    
    // TC: O(N+M) iterating over 2 arrays A and B
    // SC: O(N+M) for the merged array 
    // and Auxiliary space is O(1) no extra spaced used only just pointers variables 
    public int[] solve(final int[] A, final int[] B) {

        int N=A.length;
        int M=B.length;
        int[] arr=new int[N+M];

        int i=0;
        int j=0;
        int k=0;
        while(j<N && k<M){
            if(A[j]<B[k]){
                arr[i]=A[j];
                j++;
            }else{
                arr[i]=B[k];
                k++;
            }
            i++;
        }

        while(j<N){
            arr[i]=A[j];
            i++;
            j++;
        }

        while(k<M){
            arr[i]=B[k];
            i++;
            k++;
        }
        return arr;
    }
}

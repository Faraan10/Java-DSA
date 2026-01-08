package sorting.sortingAdvanced;

public class MegreTwoSortedArrays {
    
    // TC: O(N)
    // SC: O(N+M)
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

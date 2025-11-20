package arrays.sorting;

import java.util.Arrays;

public class KthSmallestElement {

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    // we are not to modify the original array so creating a copy and modifying
    // this approach below solves solution in <=B steps

    // TC: O(B*N)
    // SC: O(N)
    public int brutekthsmallest(final int[] A, int B) {

        int arr[]=new int[A.length];
        for(int i=0; i<A.length; i++){
            arr[i]=A[i];
        }

        int n=arr.length;
        for(int i=0; i<B; i++){
            int minindex=i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[minindex]){
                    minindex=j;
                }
            }
            int temp=arr[minindex];
            arr[minindex]=arr[i];
            arr[i]=temp;
        }
    return arr[B-1];
    }
    
    

    // TC: O(N log N)
    // SC: O(N)
    public int kthsmallest(final int[] A, int B) {

        int N=A.length;
        int[] arr=new int[N];

        for(int i=0; i<N; i++){
            arr[i]=A[i];
        }
        Arrays.sort(arr);

        return arr[B-1];
    }
}

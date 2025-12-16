package arrays;

import java.util.Arrays;

public class AddOneToNumber {
    
    // TC: O(N)
    // SC: O(1) extra array space
    public int[] plusOne(int[] A) {

        int N=A.length;

        int j=0;
        while(j<N && A[j]==0){
            j++;
        }

        if(j==N){
            return new int[] {1};
        }

        for(int i=N-1; i>=j; i--){
            if(A[i]<9){
                A[i]++;
                return Arrays.copyOfRange(A,j,N);
            }
            A[i]=0;
        }

        int[] arr=new int[N+1-j];
        for(int i=j; i<A.length; i++){
            arr[i-j+1]=A[i];
        }
        arr[0]=1;
        return arr;
    }
}

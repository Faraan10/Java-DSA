package two_d_arrays;

public class ColumnSum {
    
    public int[] solve(int[][] A) {
        
        // TC: O(M*N)
        // SC: O(1)
        int N=A.length;
        int M=A[0].length;
        int[] arr=new int[M];

        for(int i=0; i<M; i++){
            int sum=0;
            for(int j=0; j<N; j++){
                sum+=A[j][i];
                // System.out.print(A[j][i]+" ");
            }
            arr[i]=sum;
        }
        return arr;
    }
}

package two_d_arrays;

public class MinorDiagnolSum {
    
    // TC: O(N)
    // SC: O(1)
    public int solve(final int[][] A) {
       
       int N=A.length;
       int M=A[0].length;

       int i=0;
       int j=M-1;
       int sum=0;

       while(i<N && j>=0){
           sum+=A[i][j];
           i++;
           j--;
       }
       return sum;
    }
}

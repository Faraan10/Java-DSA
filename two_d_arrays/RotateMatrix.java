package two_d_arrays;

public class RotateMatrix {
    
    // TC: O(N^2)
    // SC: O(1)
    public void solve(int[][] A) {
        
        int N=A.length;

        for(int i=0; i<N; i++){
            for(int j=i+1; j<N; j++){
                int temp=A[i][j];
                A[i][j]=A[j][i];
                A[j][i]=temp;
            }
        }

        for(int i=0; i<N; i++){
            int left=0;
            int right=N-1;
            while(left<right){
                int temp=A[i][left];
                A[i][left]=A[i][right];
                A[i][right]=temp;
                left++;
                right--;
            }
        }
    }
}

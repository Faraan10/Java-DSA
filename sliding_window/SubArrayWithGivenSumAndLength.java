package sliding_window;

public class SubArrayWithGivenSumAndLength {
    
    // TC: O(N)
    // SC: O(1)
    public int solve(int[] A, int B, int C) {

        int N=A.length;
        int sum=0;
        for(int i=0; i<B; i++){
            sum+=A[i];
        }
        if(sum==C){
            return 1;
        }

        int i=1;
        int j=B;
        while(j<N){
            sum=sum-A[i-1]+A[j];
            if(sum==C){
                return 1;
            }
            i++;
            j++;
        }
        return 0;
    }
}

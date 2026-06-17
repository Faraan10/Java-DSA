package AllBasicProblemsList;

public class SubarrayWithGivenSumAndLength {
    
    // TC: O(N)
    // SC: O(1)
    // sliding window approach otpimzied
    public int solve(int[] A, int B, int C) {

        int N=A.length;
        int i=0;
        int j=B;
        int sum=0;
        while(i<j){
            sum+=A[i];
            i++;
        }
        if(sum==C){
            return 1;
        }

        i=1;
        j=B;
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

package arrays.subarraysAndCarryForward;

public class SumOfAllSubarrays {
    
    // TC: O(N)
    // SC: O(1)
    // contribution technique
    
    public long subarraySum(int[] A) {

        int N=A.length;

        long sum=0;

        for(int i=0; i<N; i++){
            sum+=(long)(i+1)*(N-i)*A[i];
        }
        return sum;
    }
}

package arrays.subarraysAndCarryForward;

public class GoodSubarrays {
    
    // TC: O(N^2)
    // SC: O(1)
    // brute force

     // here in this problem we cannot use sliding window as there is parity 
     // sum>B and sum<B both array length even and array length odd 
     // the problem statement should be monotonic
    public int solve(int[] A, int B) {

        int N=A.length;
        int count=0;

        for(int i=0; i<N; i++){
            int sum=0;
            for(int j=i; j<N; j++){
                sum+=A[j];
                if(sum<B && (j-i+1)%2==0){
                    count++;
                }

                if(sum>B && (j-i+1)%2==1){
                    count++;
                }
            }
        }
        return count;
    }
}

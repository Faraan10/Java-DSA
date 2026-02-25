package revision;

public class CountingSubarrays {
    
    // TC: O(N^2)
    // SC: O(1)
    public int solve(int[] A, int B) {

        int N=A.length;
        int count=0;

        for(int i=0; i<N; i++){
            int ans=0;
            for(int j=i; j<N; j++){
                ans+=A[j];
                if(ans<B){
                    count++;
                }
            }
        }
        return count;
    }

    
}

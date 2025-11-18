package arrays.subarrays;

public class GoodSubarrays {
    
    // TC: O(N^2)
    // SC: O(1)
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

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

    // TC: O(N)
    // SC: O(1)
    public int optimizedSolve(int[] A, int B) {

        int N=A.length;
        int count=0;
        int left=0;
        int sum=0;

        for(int right=0; right<N; right++){

            sum+=A[right];

            while(sum>=B && left<=right){
                sum=sum-A[left];
                left++;
            }

            count=count+(right-left+1);
        }
        return count;
    }
}

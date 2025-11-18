package arrays.subarrays;

public class GoodSubarrays {
    
    // TC: O(N^2)
    // SC: O(1)
    // brute force
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


    // optimized approach using sliding window shrinking window until sum>=B
    // then counting the subarray

    // TC: O(N)
    // SC: O(1)
    public int optimizedSolve(int[] A, int B) {

        int N=A.length;
        int left=0;
        int sum=0;
        int count=0;

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

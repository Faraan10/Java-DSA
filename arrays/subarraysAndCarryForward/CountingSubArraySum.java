package arrays.subarraysAndCarryForward;

public class CountingSubArraySum {
    
    // TC: O(N^2)
    // SC: O(1)
    public int solve(int[] A, int B) {

        int N=A.length;

        int count=0;

        for(int i=0; i<N; i++){
            int sum=0;
            for(int j=i; j<N; j++){
                sum+=A[j];
                if(sum<B){
                    count++;
                }
            }
        }
        return count;
    }


    // problem statement:
    // you need to find the number of subarrays in A with a sum less than B.
    // We may assume that there is no overflow.

    // by the problem statement it says that there are only non-negative integers
    // so when adding sum it will keep on increasing without change (mean decreasing)
    // which is monotonic condition so we can use sliding window
    // most optmized solution using (Sliding window)
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

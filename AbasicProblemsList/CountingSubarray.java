package AbasicProblemsList;

public class CountingSubarray {
    
    // TC: O(N)
    // SC: O(1)
    // OPTIMIZED Solution with kind of sliding window
    // NOTE: We can only use sliding window when the 
    // quantity you're tracking (sum, cost, etc.) 
    // should change monotonically as the window 
    // expands/shrinks.
    // means when expanding it should either decrease sum or 
    // increase sum not both 
    public int solve(int[] A, int B) {

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

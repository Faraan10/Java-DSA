package revision;

public class Equilibrium {
    
    // TC: O(N) traversing 2 times till N which is N+N=2N in worst case O(N)
    // SC: O(1) no extra space used except few variables
    public int solve(int[] A){

        int N=A.length;
        int totalSum=0;
        for(int i=0; i<N; i++){
            totalSum=totalSum+A[i];
        }

        int leftSum=0;
        for(int i=0; i<N; i++){

            int rightSum=totalSum-leftSum-A[i];

            if(leftSum==rightSum){
                return i;
            }
            leftSum+=A[i];
        }
        return -1;
    }
}

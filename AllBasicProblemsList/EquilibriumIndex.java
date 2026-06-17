package AbasicProblemsList;

public class EquilibriumIndex {
    
    // TC: O(N)
    // SC: O(1)
    public int solve(int[] A) {

        int N=A.length;
        int ans=-1;
        int totalSum=0;

        for(int i=0; i<N; i++){
            totalSum+=A[i];
        }

        int val=0;
        for(int i=0; i<N; i++){

            if(totalSum-A[i]-val==val){
                ans=i;
            }
            val+=A[i];
        }
        return ans;
    }


    // more optimized with good naming conventions and variables
    // same tc and sc as above
    // TC: O(N)
    // SC: O(1)
    public int optSolve(int[] A) {

        int N=A.length;
        int totalSum=0;

        for(int i=0; i<N; i++){
            totalSum+=A[i];
        }

        int left=0;
        for(int i=0; i<N; i++){

            int right=totalSum-left-A[i];

            if(left==right){
                return i;
            }
            left+=A[i];
        }
        return -1;
    }
}

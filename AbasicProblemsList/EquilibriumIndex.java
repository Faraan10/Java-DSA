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
}

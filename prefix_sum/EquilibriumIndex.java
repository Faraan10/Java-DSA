package prefix_sum;

public class EquilibriumIndex {
    
    public int solve(int[] A) {

        int N=A.length;
        int ans=-1;

        for(int i=0; i<N; i++){
            int beforeSum=0;
            int afterSum=0;

            for(int j=0; j<i; j++){
                beforeSum+=A[j];
            }

            for(int j=i+1; j<N; j++){
                afterSum+=A[j];
            }
            if(beforeSum==afterSum){
                return i;
            }
        }
        return ans;
    }
}

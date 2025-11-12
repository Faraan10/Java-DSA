package prefix_sum;

public class SpecialIndex {
    
    // TC: O(N^2)
    // SC: O(1)
    // optimized brute force approach
    public int solve(int[] A) {

        int N=A.length;
        int count=0;

        for(int i=0; i<N; i++){
            int evenSum=0;
            int oddSum=0;
            int index=0;

            for(int j=0; j<N; j++){
                if(i==j){
                    continue;
                }

                if(index%2==0){
                    evenSum+=A[j];
                }else{
                    oddSum+=A[j];
                }
                index++;
            }
            if(evenSum==oddSum){
                count++;
            }
        }
        return count;
    }
}
